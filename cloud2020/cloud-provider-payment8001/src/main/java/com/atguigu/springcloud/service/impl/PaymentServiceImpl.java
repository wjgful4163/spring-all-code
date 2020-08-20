package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.CommResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: wjgful
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public CommResult create(Payment payment) {
        int i= paymentDao.create(payment);
        if(i>0){
         return new CommResult(200,"插入数据成功！");
        }
        return new CommResult(444,"插入数据失败");
    }

    @Override
    public CommResult<Payment> getPaymentById(long id) {
        Payment payment = paymentDao.getPaymentById(id);
        if(payment!=null){
            return new CommResult<Payment>(200,"查询数据成功",payment);
        }
        return new CommResult<>(444,"没有对应数据"+id,null);
    }
}
