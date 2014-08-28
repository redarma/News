package net.grupo09.newsportal.service.impl;

import static net.grupo09.newsportal.service.util.QueryParameters.setParam;

import javax.persistence.PersistenceException;

import net.grupo09.newsportal.domain.Category;
import net.grupo09.newsportal.exception.ServiceException;
import net.grupo09.newsportal.repository.GenericRepository;
import net.grupo09.newsportal.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation of {@link CategoryService}
 * 
 * @author Juan
 */
@Service("CategoryService")
public class CategoryServiceImpl extends AbstractServiceImpl<Category>
		implements CategoryService {

	@Autowired
	public CategoryServiceImpl(GenericRepository<Category, Long> repository) {
		super(repository);
	}

	/**
	 * @see net.grupo09.newsportal.service.CategoryService#getByName(java.lang.String)
	 */
	@Override
	public Category getByName(String name) {
		try {
			return repository.getByNamedQuery("Category.GET_BY_NAME",
					setParam("name", name).buildMap());
		} catch (PersistenceException e) {
			String message = String.format("Unable to get category=%s", name);
			throw new ServiceException(message, e);
		}
	}
}
