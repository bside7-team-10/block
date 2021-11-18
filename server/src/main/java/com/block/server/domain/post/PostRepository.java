package com.block.server.domain.post;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.geo.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.awt.*;
import java.util.List;


@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

    @Query("select p from Post p")
    List<Post> findWithPagination(PageRequest pageable);

    @Query(value = "SELECT *,(6371*ACOS(COS(RADIANS(:fieldLat))*COS(RADIANS(latitude))*COS(RADIANS(longitude)-RADIANS(:fieldLong))" +
            "+SIN(RADIANS(:fieldLat))*SIN(RADIANS(latitude)))) AS distance FROM Post HAVING distance < :fieldRange ORDER BY distance DESC",
        countQuery = "SELECT count(*) FROM Post WHERE (SELECT (6371*ACOS(COS(RADIANS(:fieldLat))*COS(RADIANS(latitude))*COS(RADIANS(longitude)-RADIANS(:fieldLong))" +
                "+SIN(RADIANS(:fieldLat))*SIN(RADIANS(latitude)))) AS distance FROM Post HAVING distance < :fieldRange)",
        nativeQuery = true)
    List<Post> findWithLocationRange(Pageable pageable, @Param("fieldLong") double userLong, @Param("fieldLat") double userLat, @Param("fieldRange") int range);
}

