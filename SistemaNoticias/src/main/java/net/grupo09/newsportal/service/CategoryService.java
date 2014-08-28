package net.grupo09.newsportal.service;

import net.grupo09.newsportal.domain.Category;

/**
 * Provides category-related operations
 * 
 * @author Juan
 */
public interface CategoryService extends AbstractService<Category> {
	
	/**
	 * Get category from repository by it's name
	 * 
	 * @param name category name
	 * @return category
	 */
	Category getByName(String name);
}
