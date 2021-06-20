package com.skc.feign.client.app.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="server-app", url = "http://localhost:8091")
public interface ProxyForServerApp {

    @GetMapping(path="/test1")
    public String callTest1();
}
