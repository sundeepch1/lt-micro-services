package com.skc.controller;

import com.skc.proxy.Proxy4App4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Proxy4App4 proxy4App4;

    @GetMapping("hello1")
    public String hello1(){
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.info("{}", "logger message from app3.hello1");
        System.out.println("From app3.hello1");

        String app4Results = proxy4App4.callTest1();

        return "from app3.hello1 -- " + app4Results;
    }
}
