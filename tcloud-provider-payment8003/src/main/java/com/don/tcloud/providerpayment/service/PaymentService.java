package com.don.tcloud.providerpayment.service;


import com.don.tcloud.apicommons.entities.Payment;

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(Integer id);
}
