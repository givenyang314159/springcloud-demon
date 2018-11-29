package com.study.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.study.common.service"})
@ComponentScan({"com.study.common.service","com.study.consumer"})
public class ConsumerDeptFeign {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDeptFeign.class,args);
    }
}
