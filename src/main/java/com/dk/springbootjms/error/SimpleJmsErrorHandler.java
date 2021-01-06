package com.dk.springbootjms.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.ErrorHandler;

@Slf4j
@Service
public class SimpleJmsErrorHandler implements ErrorHandler {

    @Override
    public void handleError(Throwable t) {
        log.warn("In default jms error handler...");
        log.error("Error Message : {}", t.getMessage());
    }

}