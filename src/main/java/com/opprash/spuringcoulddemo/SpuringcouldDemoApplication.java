package com.opprash.spuringcoulddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpuringcouldDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpuringcouldDemoApplication.class, args);
    }
}
