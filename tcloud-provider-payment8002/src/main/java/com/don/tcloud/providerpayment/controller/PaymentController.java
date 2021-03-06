package com.don.tcloud.providerpayment.controller;


import com.don.tcloud.apicommons.entities.CommonResult;
import com.don.tcloud.apicommons.entities.Payment;
import com.don.tcloud.providerpayment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;
    @Autowired
    DiscoveryClient discoveryClient;

    @PostMapping("/create")
    public CommonResult<Payment> create(@RequestBody Payment payment)
    {
        int result = paymentService.create(payment);
        if (result > 0) {
            return new CommonResult(200, "success: server port" + serverPort, result);
        }
        return new CommonResult(445, "fail", null);
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id)
    {
        Payment payment = paymentService.getPaymentById(id);
        if (null == payment) {
            return new CommonResult(445, "fail", null);
        }
        return new CommonResult(200, "cuccess: server port" + serverPort, payment);
    }

    @GetMapping("/discoveries")
    public CommonResult discoveryList()
    {
        List<String> discoveries = discoveryClient.getServices();
        return new CommonResult(200, "success", discoveries);
    }
}
