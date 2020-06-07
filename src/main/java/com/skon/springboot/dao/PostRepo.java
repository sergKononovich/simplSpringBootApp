package com.skon.springboot.dao;

import com.skon.springboot.dto.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long> {
}
