package com.example.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Age;
import com.example.demo.configuration.AgeConfiguration;

@RestController
public class AgeResources {

	@Autowired
	private AgeConfiguration conf;
	
	
	@GetMapping("/getage")
	public Age getAgeDetails() {
		Age age = new Age(conf.getMax(), conf.getMin());
		
		return age;
	}
	
}
