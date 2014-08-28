package net.grupo09.newsportal.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.PersistenceException;

import net.grupo09.newsportal.domain.Tag;
import net.grupo09.newsportal.exception.ServiceException;
import net.grupo09.newsportal.repository.GenericRepository;
import net.grupo09.newsportal.service.TagService;
import net.grupo09.newsportal.web.constants.Common;
import static net.grupo09.newsportal.service.util.QueryParameters.setParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implementation of {@link TagService}
 * 
 * @author Juan
 */
@Service("TagService")
public class TagServiceImpl extends AbstractServiceImpl<Tag> implements TagService {
	
	/**
	 * Constructor autowiring tag-repository
	 */
	@Autowired 
	public TagServiceImpl(GenericRepository<Tag, Long> repository) {
		super(repository);
	}
	
	/**
	 * @see net.grupo09.newsportal.service.TagService#getByName(java.lang.String)
	 */
	@Override
	public Tag getByName(String name) {
		try {
			return repository.getByNamedQuery("Tag.GET_BY_NAME",
					setParam("name", name).buildMap());
		} catch (PersistenceException e) {
			String message = String.format("Unable to get tag=%s", name);
			throw new ServiceException(message, e);
		}
	}
	
	/**
	 * @see net.grupo09.newsportal.service.impl.AbstractServiceImpl#getAllTransactionally()
	 */
	@Override
	@Transactional
	public List<Tag> getAllTransactionally() {
		try {
			return repository.getAllByNamedQuery(
					"Tag.GET_ALL", 0, Common.TAG_MAX_COUNT);
		} catch (PersistenceException e) {
			throw new ServiceException("Unable to get all tags", e);
		}
	}

	/**
	 * @see net.grupo09.newsportal.service.TagService#getAllNames()
	 */
	@Override
	@Transactional
	public List<String> getAllNames() {
		try {
			return repository.getAllNamesByNamedQuery(
					"Tag.GET_ALL_NAMES", 0);
		} catch (PersistenceException e) {
			throw new ServiceException("Unable to get all tag names", e);
		}
	}
	
	/**
	 * @see net.grupo09.newsportal.service.TagService#getAutocompleteJson()
	 */
	@Override
	public String getAutocompleteJson() {
		List<String> tagNames = this.getAllNames();
		
		if (tagNames.isEmpty()) {
			return "[]";
		}
		
		StringBuilder result = new StringBuilder("[");
		for (String name : tagNames) {
			result.append("\"")
				.append(name)
				.append("\"")
				.append(",");
		}
		result.delete(result.length()-1, result.length())
			.append("]");
		return result.toString();
	}
	
	/**
	 * @see net.grupo09.newsportal.service.TagService#getTagsFromString(java.lang.String)
	 */
	@Override
	public Set<Tag> getTagsFromString(String tagString) {
		Set<Tag> result = new HashSet<Tag>();
		for (String tagName : tagString.split(",")) {
			tagName = tagName.replaceAll("\\s+", "");
			Tag tagObj = this.getByName(tagName);	// get persistent object
			if (tagObj == null) {
				tagObj = new Tag();
				tagObj.setName(tagName);
			}
			result.add(tagObj);
		}
		return result;
	}

	/**
	 * @see net.grupo09.newsportal.service.TagService#getTagString(java.util.Set)
	 */
	@Override
	public String getTagString(Set<Tag> tags) {
		StringBuilder result = new StringBuilder();
		for (Tag tag : tags) {
			result.append(tag.getName()).append(",");
		}
		result.delete(result.length()-1, result.length());
		return result.toString();
	}
}
