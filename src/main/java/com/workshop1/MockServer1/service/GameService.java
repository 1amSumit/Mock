package com.workshop1.MockServer1.service;

import com.workshop1.MockServer1.model.UserAttempt;
import com.workshop1.MockServer1.repository.UserAttemptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GameService {

    private final UserAttemptRepository userAttemptRepository;
    private int targetNumber;
    private Map<String, Integer> userAttempts;

    @Autowired
    public GameService(UserAttemptRepository userAttemptRepository) {
        this.userAttemptRepository = userAttemptRepository;
        this.userAttempts = new HashMap<>();
        resetGame();
    }

    public String guess(String userId, int number) {
        UserAttempt userAttempt = userAttemptRepository.findByUserId(userId);
        if (userAttempt == null) {
            userAttempt = new UserAttempt(userId, 0);
        }
        
        userAttempt.setAttempts(userAttempt.getAttempts() + 1);
        userAttemptRepository.save(userAttempt);

        if (number == targetNumber) {
            return "Congratulations " + userId + "! You guessed the correct number in " + userAttempt.getAttempts() + " tries.";
        } else if (number < targetNumber) {
            return "Try a higher number!";
        } else {
            return "Try a lower number!";
        }
    }

    public void resetGame() {
        targetNumber = (int) (Math.random() * 100 + 1);
//        userAttemptRepository.deleteAll(); // Clear previous attempts when the game is reset
    }

    public Map<String, Integer> getUserAttempts() {
        Map<String, Integer> attemptsMap = new HashMap<>();
        for (UserAttempt userAttempt : userAttemptRepository.findAll()) {
            attemptsMap.put(userAttempt.getUserId(), userAttempt.getAttempts());
        }
        return attemptsMap;
    }
}
