package com.config.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties("age")
public class Age {

    private String vardhan;
    private String ram;
    private String name1;
    private String name2;

    public void setVardhan(String vardhan) {
        this.vardhan = vardhan;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getVardhan() {
        return vardhan;
    }

    public String getRam() {
        return ram;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Bean
    @Profile("qa")
    public String qaBean() {
        return  "qa bean";
    }

    @Bean
    @Profile("prod")
    public String prodBean() {
        return  "prod bean";
    }
}
