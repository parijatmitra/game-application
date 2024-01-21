package com.example.Game.service;

import com.example.Game.domain.Player;
import com.example.Game.exception.PlayerException;
import com.example.Game.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public List<Player> findAllPlayers() {
        return playerRepository.findAll();
    }

    public Player getPlayerById(int playerId) {
        return playerRepository.findById(playerId)
                .orElseThrow(() -> new PlayerException("Player wih id=" + playerId + " not found"));

    }
}
