package com.skc.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skc.exception.AgeInvalidException;

@RestController
public class Test1Controller {
	
	@GetMapping("test1/reg")
	public String getAge(@RequestParam Integer age) {
		System.out.println("from getAge begin");
		if(age <= 0) {
			throw new AgeInvalidException("age should be greater than 0.");
		}
		System.out.println("from getAge end");
		return "age is : " + age;
	}

}
