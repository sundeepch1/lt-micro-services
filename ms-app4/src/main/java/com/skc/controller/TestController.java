package com.skc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test1")
    public String hello1(){
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.info("{}", "logger message from app4.test1");
        System.out.println("From app4.test1");
        return "From app4.test1";
    }
}
