package com.config.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("age")
public class Age {

    private String vardhan;
    private String ram;

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
}
