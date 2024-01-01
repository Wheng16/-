package com.weiheng.shuttlespace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weiheng.shuttlespace.model.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
