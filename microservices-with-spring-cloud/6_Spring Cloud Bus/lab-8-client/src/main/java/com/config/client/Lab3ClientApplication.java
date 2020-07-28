package com.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Lab3ClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =SpringApplication.run(Lab3ClientApplication.class, args);

		for(String bean: configurableApplicationContext.getBeanDefinitionNames()) {
			System.out.println("bean name ===>"+bean);
		}
	}

}
