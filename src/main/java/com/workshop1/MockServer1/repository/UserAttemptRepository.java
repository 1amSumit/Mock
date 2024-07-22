package com.workshop1.MockServer1.repository;

import com.workshop1.MockServer1.model.UserAttempt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAttemptRepository extends JpaRepository<UserAttempt, Long> {
    UserAttempt findByUserId(String userId);
}
