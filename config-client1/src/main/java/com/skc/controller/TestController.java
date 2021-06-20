package com.skc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.skc.bean.Limit;

@RestController
public class TestController {
	
	@Autowired
	private Limit limit;
	
	@GetMapping(path = "/read")
	public String getValues() {
		return "min-value: " + limit.getMinValue() + ", max-value: " + limit.getMaxValue();
	}
	
	@GetMapping(path = "/test")
	@HystrixCommand(fallbackMethod = "someMethod")
	public String test() {
		throw new RuntimeException("some thing went wrong");
	}
	
	public String someMethod() {
		return "done";
	}

}
