package com.rbspring.cblog.service;

import java.util.List;

import com.rbspring.cblog.model.Post;

public interface CblogService {
	
	List<Post> findAll();
	Post findById(long id);
	Post save(Post post);

}
