package com.rbspring.cblog.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbspring.cblog.model.Post;
import com.rbspring.cblog.repository.CblogRepository;
import com.rbspring.cblog.service.CblogService;

@Service
public class CblogServiceImpl implements CblogService{

	@Autowired
	CblogRepository cblogRepository;
	
	@Override
	public List<Post> findAll() {
		return cblogRepository.findAll();
	}

	@Override
	public Post findById(long id) {
		return cblogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return cblogRepository.save(post);
	}

}
