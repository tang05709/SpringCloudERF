package com.don.tcloud.providerpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderPayment {
    public static void main(String[] args) {
        SpringApplication.run(ProviderPayment.class, args);
    }
}
