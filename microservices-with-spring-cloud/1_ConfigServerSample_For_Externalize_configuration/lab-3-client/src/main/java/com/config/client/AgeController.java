package com.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeController {
    @Autowired
    Age age;

    @GetMapping("/age")
    public String getAgeDetails() {

        return "age-vardhan "+age.getVardhan() + "age_ram "+age.getRam();
    }
}
