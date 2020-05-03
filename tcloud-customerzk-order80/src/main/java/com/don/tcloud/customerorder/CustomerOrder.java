package com.don.tcloud.customerorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerOrder {
    public static void main(String[] args)
    {
        SpringApplication.run(CustomerOrder.class, args);
    }
}
