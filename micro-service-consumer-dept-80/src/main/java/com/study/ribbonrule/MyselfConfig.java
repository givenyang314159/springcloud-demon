package com.study.ribbonrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyselfConfig {

    @Bean
    public IRule getRibbonRule()
    {
         return new RoundRule4five();
    }
}
