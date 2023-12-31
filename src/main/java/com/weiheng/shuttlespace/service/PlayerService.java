package com.weiheng.shuttlespace.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.weiheng.shuttlespace.dto.PlayerDto;
import com.weiheng.shuttlespace.model.Player;
import com.weiheng.shuttlespace.repository.PlayerRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PlayerService {

    private final PlayerRepository playerRepository;
    private final ModelMapper modelMapper;

    public PlayerService(PlayerRepository playerRepository, ModelMapper modelMapper) {
        this.playerRepository = playerRepository;
        this.modelMapper = modelMapper;
        log.info("MySejahtera Service created");
    }

    public List<PlayerDto> getPlayers() {
        List<Player> players = playerRepository.findAll();

        List<PlayerDto> playerDtos = new ArrayList<>();
        for(Player player : players) {
            PlayerDto playerDto = modelMapper.map(player, PlayerDto.class);
            playerDtos.add(playerDto);
        }

        return playerDtos;
    }
}

