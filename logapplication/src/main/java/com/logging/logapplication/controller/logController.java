package com.logging.logapplication.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class logController {

    Logger logger = LoggerFactory.getLogger(logController.class);

    @GetMapping("/")
    public String greet(){
        logger.info("Running info log..");
        logger.warn("Running warn log..");
        logger.error("Running error log..");
        logger.debug("Running debug log..");
        logger.trace("Running trace log..");

        return "Hello Vamsi..";
    }
}
