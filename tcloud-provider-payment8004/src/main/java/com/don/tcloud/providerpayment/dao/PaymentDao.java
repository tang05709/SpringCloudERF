package com.don.tcloud.providerpayment.dao;


import com.don.tcloud.apicommons.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(Integer id);
}
