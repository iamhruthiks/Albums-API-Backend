package com.example.SpringRestDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringRestDemo.model.Photo;

public interface PhotoRepository extends JpaRepository<Photo,Long> {
}
