package com.workshop1.MockServer1.service;

import org.springframework.stereotype.Service;

@Service
public class CounterService {

    private int gameRequestCount = 0;
    private int studentRequestCount = 0;

    public void incrementGame() {
        gameRequestCount++;
    }

    public int getGameRequestCount() {
        return gameRequestCount;
    }

    public int getStudentRequestCount() {
        return studentRequestCount;
    }
    
    public void incrementStudent() {
        studentRequestCount++;
    }
}
