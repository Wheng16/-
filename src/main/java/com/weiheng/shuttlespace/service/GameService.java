package com.weiheng.shuttlespace.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.weiheng.shuttlespace.dto.GameDto;
import com.weiheng.shuttlespace.model.Game;
import com.weiheng.shuttlespace.repository.GameRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class GameService {

    private final GameRepository gameRepository;
    private final ModelMapper modelMapper;

    public GameService(GameRepository gameRepository, ModelMapper modelMapper) {
        this.gameRepository = gameRepository;
        this.modelMapper = modelMapper;

        log.info("Game Service created!");
    }

    public List<GameDto> getGames() {
        List<Game> games = gameRepository.findAll();

        List<GameDto> gameDtos = new ArrayList<>();
        for(Game game : games) {
            GameDto gameDto = modelMapper.map(game, GameDto.class);
            gameDtos.add(gameDto);
        }

        return gameDtos;
    }
    
}
