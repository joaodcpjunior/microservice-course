package com.joaodcpjunior.hroautth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HrOautthApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrOautthApplication.class, args);
    }

}
