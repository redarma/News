package net.grupo09.newsportal.service.impl;

import net.grupo09.newsportal.domain.Comment;
import net.grupo09.newsportal.repository.GenericRepository;
import net.grupo09.newsportal.service.CommentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CommentService")
public class CommentServiceImpl extends AbstractServiceImpl<Comment>
		implements CommentService {

	@Autowired
	public CommentServiceImpl(GenericRepository<Comment, Long> repository) {
		super(repository);
	}

}
