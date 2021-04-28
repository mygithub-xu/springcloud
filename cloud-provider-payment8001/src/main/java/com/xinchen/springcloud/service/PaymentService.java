package com.xinchen.springcloud.service;

import com.xinchen.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(long id);
}
