package com.cxytiandi.web.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService{

    @Async
    public void saveLog() {
        System.err.println(Thread.currentThread().getName());
    }
}
