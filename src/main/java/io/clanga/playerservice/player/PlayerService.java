package io.clanga.playerservice.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import io.clanga.gamesshared.player.Player;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    public Optional<Player> getPlayer(Long id) {
        return playerRepository.findById(id);
    }

    public Iterable<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player updatePlayer(long id, Player player) {
        if (playerRepository.findById(id).isPresent()) {
            player.setId(id);
            return playerRepository.save(player);
        }
        else {
            return null;
        }
    }

    public Optional<Player> login(String userName) {
        return playerRepository.findByUserName(userName);
    }

    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }
}
