package com.study.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServer7002 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServer7002.class,args);

    }
}
