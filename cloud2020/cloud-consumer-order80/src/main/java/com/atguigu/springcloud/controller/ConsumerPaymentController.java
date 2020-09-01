package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.zip.CheckedOutputStream;

/**
 * @author: wjgful
 */
@RestController
@RequestMapping("/consumer/payment")
public class ConsumerPaymentController {
    private static final String ROOT_PATH="http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/create")
    public CommonResult<Payment> create( Payment payment){
        return restTemplate.postForObject(ROOT_PATH+"/payment/create",payment, CommonResult.class);
    }

    @GetMapping("/getPayment/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") long id){
        return restTemplate.getForObject(ROOT_PATH+"/payment/getPayment/"+id, CommonResult.class);
    }
}
