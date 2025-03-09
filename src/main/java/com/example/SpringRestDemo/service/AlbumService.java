package com.example.SpringRestDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringRestDemo.model.Album;
import com.example.SpringRestDemo.repository.AlbumRepository;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;
    
    public Album save(Album album) {
        return albumRepository.save(album);
    }

}
