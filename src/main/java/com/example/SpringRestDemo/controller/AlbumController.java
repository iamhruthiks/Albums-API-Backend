package com.example.SpringRestDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringRestDemo.model.Account;
import com.example.SpringRestDemo.model.Album;
import com.example.SpringRestDemo.payload.auth.album.AlbumPayloadDTO;
import com.example.SpringRestDemo.payload.auth.album.AlbumViewDTO;
import com.example.SpringRestDemo.service.AccountService;
import com.example.SpringRestDemo.service.AlbumService;
import com.example.SpringRestDemo.util.constants.AlbumError;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/v1/album")
@Tag(name = "Album Controller", description = "Controller for album and photo management")
@Slf4j
public class AlbumController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AlbumService albumService;

    @PostMapping(value = "/albums/add", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiResponse(responseCode = "400", description = "Please add valid name a description")
    @ApiResponse(responseCode = "200", description = "Album added")
    @Operation(summary = "Add an Album")
    @SecurityRequirement(name = "springrestful-demo-api")
    public ResponseEntity<AlbumViewDTO> addAlbum(@Valid @RequestBody AlbumPayloadDTO albumPayloadDTO,
            Authentication authentication) {
        try {
            Album album = new Album();
            album.setName(albumPayloadDTO.getName());
            album.setDescription(albumPayloadDTO.getDescription());
            String email = authentication.getName();
            Optional<Account> optionalAccount = accountService.findByEmail(email);
            Account account = optionalAccount.get();
            album.setAccount(account);
            album = albumService.save(album);
            AlbumViewDTO albumViewDTO = new AlbumViewDTO(album.getId(), album.getName(), album.getDescription());
            return ResponseEntity.ok(albumViewDTO);

        } catch (Exception e) {
            log.debug(AlbumError.ADD_ALBUM_ERROR.toString() + ": " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @GetMapping(value = "/albums", produces = "application/json")
    @ApiResponse(responseCode = "400", description = "Please add valid name a description")
    @ApiResponse(responseCode = "200", description = "Album added")
    @Operation(summary = "List album api")
    @SecurityRequirement(name = "springrestful-demo-api")
    public List<AlbumViewDTO> albums( Authentication authentication) {
        String email = authentication.getName();
        Optional<Account> optionalAccount = accountService.findByEmail(email);
        Account account = optionalAccount.get();
        List<AlbumViewDTO> albums = new ArrayList<>();
        for (Album album : albumService.findByAccount_id(account.getId())) {
            albums.add(new AlbumViewDTO(album.getId(), album.getName(), album.getDescription()));
        }
        return albums;
    }
}
