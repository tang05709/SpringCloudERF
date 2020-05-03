package com.don.tcloud.customerorder.controller;

import com.don.tcloud.apicommons.entities.CommonResult;
import com.don.tcloud.apicommons.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/customer")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    //private final static String PAYMENR_URI = "http://127.0.0.1:8001";
    private final static String PAYMENR_URI = "http://TCLOUD-PAYMENT-PROVIDER";


    @GetMapping("/payment/create")
    public CommonResult<Payment> create(Payment payment)
    {
        //return restTemplate.postForObject(PAYMENR_URI + "/payment/create", payment, CommonResult.class);
        return restTemplate.postForEntity(PAYMENR_URI + "/payment/create", payment, CommonResult.class).getBody();
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id)
    {
        return restTemplate.getForObject(PAYMENR_URI + "/payment/get/" + id, CommonResult.class);
    }

    @GetMapping("/payment/geten/{id}")
    public CommonResult<Payment> getEntityPaymentById(@PathVariable("id") Integer id)
    {
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENR_URI + "/payment/get/" + id, CommonResult.class);
        if (entity.getStatusCode().is2xxSuccessful()) {
            return entity.getBody();
        }
        return new CommonResult(445, "fail", null);
    }

}
