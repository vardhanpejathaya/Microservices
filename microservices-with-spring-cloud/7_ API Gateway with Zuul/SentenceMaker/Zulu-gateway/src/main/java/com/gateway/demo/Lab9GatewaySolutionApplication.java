package com.gateway.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Lab9GatewaySolutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab9GatewaySolutionApplication.class, args);
	}

}
