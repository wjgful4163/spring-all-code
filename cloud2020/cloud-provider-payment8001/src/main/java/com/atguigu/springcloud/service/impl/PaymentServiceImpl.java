package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: wjgful
 */
@Slf4j
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public CommonResult create(Payment payment) {
        int i= paymentDao.create(payment);
        if(i>0){
         return new CommonResult(200,"插入数据成功！");
        }
        return new CommonResult(444,"插入数据失败");
    }

    @Override
    public CommonResult<Payment> getPaymentById(long id) {
        Payment payment = paymentDao.getPaymentById(id);
        if(payment!=null){
            return new CommonResult<Payment>(200,"查询数据成功",payment);
        }
        return new CommonResult<>(444,"没有对应数据"+id,null);
    }
}
