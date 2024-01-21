package com.example.Game.controller;

import com.example.Game.domain.Player;
import com.example.Game.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @RequestMapping(value = "/players", method = RequestMethod.GET)
    public ResponseEntity<List<Player>> findAllPlayers() {
       List<Player>players = playerService.findAllPlayers();
       if(players == null) {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
       return new ResponseEntity<>(players, HttpStatus.FOUND);
    }

    @RequestMapping(value = "/players/{id}", method = RequestMethod.GET)
    public ResponseEntity<Player> getPlayerById(@PathVariable("id") int playerId) {
        Player player = playerService.getPlayerById(playerId);
        return new ResponseEntity<>(player, HttpStatus.FOUND);
    }
}
