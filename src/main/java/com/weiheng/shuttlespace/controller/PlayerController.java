package com.weiheng.shuttlespace.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weiheng.shuttlespace.model.Player;
import com.weiheng.shuttlespace.service.PlayerService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/players")
@Validated
@Slf4j

public class PlayerController {

    private final PlayerService playerService;
    
    public PlayerController(PlayerService playerService, ModelMapper modelMapper){
        this.playerService = playerService;
        log.info("User Controller created");
    }

    // Get all users
    @GetMapping("")
    public ResponseEntity<List<Player>> getUsers() {
        return new ResponseEntity(playerService.getPlayers(), HttpStatus.OK);
    }
    
}