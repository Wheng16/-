package com.weiheng.shuttlespace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weiheng.shuttlespace.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    
}
