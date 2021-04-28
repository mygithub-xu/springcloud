package com.xinchen.springcloud.controller;

import com.xinchen.springcloud.entities.CommonResult;
import com.xinchen.springcloud.entities.Payment;
import com.xinchen.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult saveOrUpdate(@RequestBody Payment payment) {
        int i = paymentService.create(payment);
        return  new CommonResult(200,"cg"+i);
    }

    @GetMapping("/getPaymentById/{id}")
    public CommonResult saveOrUpdate(@PathVariable Long id) {
        Payment paymentById = paymentService.getPaymentById(id);
        return  new CommonResult(200,paymentById.toString(),"8002");
    }
}
