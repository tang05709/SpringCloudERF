package com.don.tcloud.customerorder.controller;

import com.don.tcloud.apicommons.entities.CommonResult;
import com.don.tcloud.apicommons.entities.Payment;
import com.don.tcloud.customerorder.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class OrderController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/payment/create")
    public CommonResult<Payment> create(Payment payment)
    {
       return paymentFeignService.create(payment);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id)
    {
        return paymentFeignService.getPaymentById(id);
    }
}
