package com.don.tcloud.ribrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibRule {
    @Bean
    public IRule myRule()
    {
        return new RandomRule(); // 自定义为随机查询
    }
}
