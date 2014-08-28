package net.grupo09.newsportal.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import net.grupo09.newsportal.domain.Article;
import net.grupo09.newsportal.exception.NotFoundException;
import net.grupo09.newsportal.service.ArticleService;
import net.grupo09.newsportal.service.CategoryService;
import net.grupo09.newsportal.service.TagService;
import net.grupo09.newsportal.web.constants.Common;
import net.grupo09.newsportal.web.constants.URL;
import net.grupo09.newsportal.web.constants.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller for home-page and static pages (about, contacts)
 * 
 * @author Juan
 */
@Controller
public class MainController {

	private ArticleService articleService;
	private CategoryService categoryService;
	private TagService tagService;

	/**
	 * Constructor autowiring needed services
	 */
	@Autowired
	public MainController(ArticleService articleService,
			CategoryService categoryService,
			TagService tagService) {
		this.articleService = articleService;
		this.categoryService = categoryService;
		this.tagService = tagService;
	}

	/**
	 * Home-page, get news on first page
	 */
	@RequestMapping(method = RequestMethod.GET, value = URL.HOME)
	public ModelAndView home(HttpSession session) {
		
		return homeModelAndView(1, session);
	}
	
	/**
	 * Home-page, get news on custom page
	 */
	@RequestMapping(method = RequestMethod.GET,value = URL.HOME_CUSTOM_PAGE)
	public ModelAndView home(@PathVariable("number") Integer pageNumber,
			HttpSession session) {

		if (pageNumber == 1) {
			return new ModelAndView("redirect:" + URL.HOME);
		}
		
		return homeModelAndView(pageNumber, session);
	}
	
	/**
	 * Fills ModelAndView with news data
	 */
	private ModelAndView homeModelAndView(Integer pageNumber, HttpSession session) {
		
		if (pageNumber < 1) {
			throw new NotFoundException("Page < 1");
		}
		
		Map<String, Object> articlesData = articleService.getByPage(pageNumber, Common.ARTICLES_PER_PAGE);
		Integer pageCount = (Integer) articlesData.get("pageCount");
		
		@SuppressWarnings("unchecked")
		List<Article> articlesByPage = (List<Article>) articlesData.get("articlesByPage");
		
		if (session.getAttribute("categories") == null) {
			session.setAttribute("categories", categoryService.getAllTransactionally());
		}
		if (session.getAttribute("tags") == null) {
			session.setAttribute("tags", tagService.getAllTransactionally());
		}
		
		return new ModelAndView(View.HOME)
				.addObject("pageCount", pageCount)
				.addObject("articlesByPage", articlesByPage)
				.addObject("currentPage", pageNumber)
				.addObject("requestUrl", URL.HOME);
	}
	
	/**
	 * About-page
	 */
	@RequestMapping(method = RequestMethod.GET, value = URL.ABOUT)
	public String aboutPage() {

		return View.ABOUT;
	}

	/**
	 * Contacts-page
	 */
	@RequestMapping(method = RequestMethod.GET, value = URL.CONTACTS)
	public String contactsPage() {

		return View.CONTACTS;
	}
}
