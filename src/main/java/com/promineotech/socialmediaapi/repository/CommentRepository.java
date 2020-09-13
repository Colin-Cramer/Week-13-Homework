package com.promineotech.socialmediaapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.socialmediaapi.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long>{

}
