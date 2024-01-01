package com.weiheng.shuttlespace.controller;

import org.springframework.web.bind.annotation.RestController;

import com.weiheng.shuttlespace.model.Game;
import com.weiheng.shuttlespace.service.GameService;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/games")
@Validated
@Slf4j
public class GameController {

    private final GameService gameService;
    private final ModelMapper modelMapper;

    public GameController(GameService gameService, ModelMapper modelMapper) {
        this.gameService = gameService;
        this.modelMapper = modelMapper;
        log.info("Game Controller created!");
    }

    //Get all games
    @GetMapping()
    public ResponseEntity<List<Game>> getGames() {
        return new ResponseEntity(gameService.getGames(), HttpStatus.OK);
    }
    
}
