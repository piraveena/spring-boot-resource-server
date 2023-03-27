package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    Logger logger = LoggerFactory.getLogger(SimpleController.class);

    @GetMapping("/")
    String hello() {

        logger.info("Hello");
        return "Hello";
    }

}
