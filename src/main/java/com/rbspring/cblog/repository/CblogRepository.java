package com.rbspring.cblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rbspring.cblog.model.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface CblogRepository extends JpaRepository<Post, Long>{

}
 