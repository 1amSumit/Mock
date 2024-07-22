package com.workshop1.MockServer1.service;

import com.workshop1.MockServer1.model.RequestLog;
import com.workshop1.MockServer1.repository.RequestLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@Service
public class RequestLoggingService {

    @Autowired
    private RequestLogRepository requestLogRepository;

    public void logRequest(HttpServletRequest request) {
        String ipAddress = request.getRemoteAddr();
        String endpoint = request.getRequestURI();
        LocalDateTime timestamp = LocalDateTime.now();

        RequestLog log = new RequestLog(ipAddress, endpoint, timestamp);
        requestLogRepository.save(log);
    }
}
