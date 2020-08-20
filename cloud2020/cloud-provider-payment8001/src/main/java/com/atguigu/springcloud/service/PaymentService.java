package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommResult;
import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: wjgful
 */
public interface PaymentService {
    CommResult create(Payment payment);

    CommResult<Payment> getPaymentById(long id);
}
