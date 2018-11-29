package com.study.consumer;

import com.study.ribbonrule.MyselfConfig;
import com.study.ribbonrule.RoundRule4five;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration =MyselfConfig.class)
public class ConsumerDept80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept80.class,args);
    }
}
