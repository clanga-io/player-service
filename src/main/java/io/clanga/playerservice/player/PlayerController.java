package io.clanga.playerservice.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import io.clanga.gamesshared.player.Player;

@RestController
@RequestMapping("/player-service/v1")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    // Create
    @PostMapping("/players")
    public Player createPlayer(@RequestBody final Player player) {
        return playerService.createPlayer(player);
    }

    // Login
    @GetMapping("/login/{userName}")
    public Optional<Player> login(@PathVariable String userName) {
        return playerService.login(userName);
    }

    // Retrieve
    @GetMapping("/players/{id}")
    public Optional<Player> getPlayer(@PathVariable Long id) {
        return playerService.getPlayer(id);
    }

    @GetMapping("/players")
    public Iterable<Player> getUsers() {
        return playerService.getAllPlayers();
    }

    // Update
    @PatchMapping("/players/{id}")
    public Player updatePlayer(@PathVariable Long id,
                               @RequestBody final Player player) {
        return playerService.updatePlayer(id, player);
    }

    // Delete
    @DeleteMapping("/players/{id}")
    public void deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
    }
}
