package com.workshop1.MockServer1.controller;

import com.workshop1.MockServer1.service.CounterService;
import com.workshop1.MockServer1.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/game")
public class GameController {

    private final GameService gameService;
    private final CounterService counterService;

    @Autowired
    public GameController(GameService gameService, CounterService counterService) {
        this.gameService = gameService;
        this.counterService = counterService;
    }

    @PostMapping("/guess/{userId}/{number}")
    public String makeGuess(@PathVariable String userId, @PathVariable int number) {
        counterService.incrementGame();
        return gameService.guess(userId, number);
    }

    @PostMapping("/reset")
    public String resetGame() {
        counterService.incrementGame();
        gameService.resetGame();
        return "Game has been reset. Start guessing!";
    }

    @GetMapping("/stats")
    public String getStats() {
        int totalRequests = counterService.getGameRequestCount() + counterService.getStudentRequestCount();
        return "Total number of requests: " + totalRequests + "\n" +
               "Game requests: " + counterService.getGameRequestCount() + "\n" +
               "Student requests: " + counterService.getStudentRequestCount();
    }

    @GetMapping("/user-attempts")
    public Map<String, Integer> getUserAttempts() {
        return gameService.getUserAttempts();
    }
}
