package com.skc.server.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping(path = "/test1")
    public String test1(){
        System.out.println("I am from test1");
        logger.info("{}", "ia m from test1");
        return "I am from test1" + this;
    }
}
