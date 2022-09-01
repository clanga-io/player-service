package io.clanga.playerservice.player;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PlayerTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String userName;
    private Long accountNumber;

    protected PlayerTest() {}

    public PlayerTest(String userName, Long accountNumber) {
        this.userName = userName;
        this.accountNumber = accountNumber;
    }
}
