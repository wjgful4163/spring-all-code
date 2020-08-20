package com.atguigu.springcloud;

import com.sun.glass.ui.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wjgful
 * @Date 2020-08-20
 */
@SpringBootApplication
public class PaymentApplicationStarter {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplicationStarter.class,args);
    }
}
