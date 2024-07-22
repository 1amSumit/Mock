package com.workshop1.MockServer1.repository;

import com.workshop1.MockServer1.model.GameAttempt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameAttemptRepository extends JpaRepository<GameAttempt, Long> {
}
