package com.example.SpringRestDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringRestDemo.model.Photo;
import java.util.List;


@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {
    List<Photo> findByAlbum_id(long id);
}

