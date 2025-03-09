package com.example.SpringRestDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringRestDemo.model.Album;

public interface AlbumRepository extends JpaRepository<Album,Long> {
    
}
