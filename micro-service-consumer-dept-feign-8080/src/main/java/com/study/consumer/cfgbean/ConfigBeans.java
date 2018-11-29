package com.study.consumer.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBeans {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

//    @Bean
//    public IRule getRibbonRule()
//    {
//        return new RoundRobinRule();  // 默认是轮询的，不用写这个Bean
//        return new RandomRule();
//        //return new RetryRule();
//       // return new RoundRule4five(); //自定义的
//
//    }
}
