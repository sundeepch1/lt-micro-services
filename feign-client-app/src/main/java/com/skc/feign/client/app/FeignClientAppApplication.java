package com.skc.feign.client.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.skc.feign.client.app")
public class FeignClientAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientAppApplication.class, args);
	}

}
