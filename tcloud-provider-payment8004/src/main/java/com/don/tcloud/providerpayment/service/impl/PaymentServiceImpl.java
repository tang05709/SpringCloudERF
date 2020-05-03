package com.don.tcloud.providerpayment.service.impl;

import com.don.tcloud.apicommons.entities.Payment;
import com.don.tcloud.providerpayment.dao.PaymentDao;
import com.don.tcloud.providerpayment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Integer id) {
        return paymentDao.getPaymentById(id);
    }
}
