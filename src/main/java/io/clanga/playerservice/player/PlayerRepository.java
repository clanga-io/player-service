package io.clanga.playerservice.player;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import io.clanga.gamesshared.player.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
    Optional<Player> findByUserName(String userName);
}
