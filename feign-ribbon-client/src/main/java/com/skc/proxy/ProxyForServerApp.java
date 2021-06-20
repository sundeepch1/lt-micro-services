package com.skc.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="zuul-api-gateway")
@RibbonClient(name="server-app")
public interface ProxyForServerApp {

    @GetMapping(path = "/server-app/test1")
    public String callTest1();
}
