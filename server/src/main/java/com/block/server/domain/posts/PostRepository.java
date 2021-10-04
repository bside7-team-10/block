package com.block.server.domain.posts;

import com.block.server.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends JpaRepository<Posts, Long>{
}

