package com.jboss.blog.repository;

import com.jboss.blog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
      List<Post> findByUser(Long userId);
      List<Post> findByCategory(Long categoryId);
}

