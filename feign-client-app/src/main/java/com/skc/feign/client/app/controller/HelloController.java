package com.skc.feign.client.app.controller;

import com.skc.feign.client.app.proxy.ProxyForServerApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private ProxyForServerApp proxyForServerApp;

    @GetMapping(path="/hello1")
    public String hello1() {
        System.out.println("from hello1");
        String results = proxyForServerApp.callTest1();
        return "from hello1:" + results;
    }
}
