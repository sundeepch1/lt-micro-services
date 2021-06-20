package com.skc.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "ms-app4", url = "localhost:9092")
public interface Proxy4App4 {

    @RequestMapping("test1")
    public String callTest1();
}
