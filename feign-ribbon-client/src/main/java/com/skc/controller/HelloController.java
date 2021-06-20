package com.skc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skc.proxy.ProxyForServerApp;

@RestController
public class HelloController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ProxyForServerApp proxyForServerApp;

    @GetMapping("/hello1")
    public String hello1(){
        System.out.println("from hello1");
        logger.info("{}", "i am from Hello1");
        return "from hello1 : " + proxyForServerApp.callTest1();
    }
}
