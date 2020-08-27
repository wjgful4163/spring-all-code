package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/**
 * @author: wjgful
 */
public interface PaymentService {
    CommonResult create(Payment payment);

    CommonResult<Payment> getPaymentById(long id);
}
