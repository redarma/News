package net.filippov.newsportal.domain;

import java.util.Date;

import net.filippov.newsportal.domain.Article;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArticleTest {

	private Article news;
	
	@Before
	public void init() {
		news = new Article();
	}
	
	@Test
	public void testCreatedNotNull() {
		Assert.assertNotNull(news.getCreated());
	}
	
	@Test
	public void testSetModified() throws InterruptedException {
		news.setLastModified(new Date());
		Date prevModified = news.getLastModified();
		
		Thread.sleep(10);
		news.setLastModified(new Date());
		
		Assert.assertTrue(news.getLastModified().after(prevModified));
	}
}
