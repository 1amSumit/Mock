package com.workshop1.MockServer1.repository;

import com.workshop1.MockServer1.model.RequestLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestLogRepository extends JpaRepository<RequestLog, Long> {
}
