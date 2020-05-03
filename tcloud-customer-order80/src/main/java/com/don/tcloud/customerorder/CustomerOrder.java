package com.don.tcloud.customerorder;

import com.don.tcloud.ribrule.RibRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "TCLOUD-PAYMENT-PROVIDER", configuration = RibRule.class)
public class CustomerOrder {
    public static void main(String[] args)
    {
        SpringApplication.run(CustomerOrder.class, args);
    }
}
