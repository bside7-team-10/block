package com.block.server.domain.post;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

    @Query("select p from Post p")
    List<Post> findWithPagination(PageRequest pageable);
}

