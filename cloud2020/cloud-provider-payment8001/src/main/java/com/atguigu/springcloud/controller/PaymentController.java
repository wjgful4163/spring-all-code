package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: wjgful
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create/payment")
    public CommResult create(@RequestBody Payment payment) {
        return paymentService.create(payment);
    }

    @GetMapping("/getPayment")
    public CommResult<Payment> getPaymentById(@RequestParam long id) {
        return paymentService.getPaymentById(id);
    }

}
