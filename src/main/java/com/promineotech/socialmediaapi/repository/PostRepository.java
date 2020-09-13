package com.promineotech.socialmediaapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.socialmediaapi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long>{

}
