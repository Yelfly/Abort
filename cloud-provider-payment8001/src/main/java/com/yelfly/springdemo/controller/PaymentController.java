package com.yelfly.springdemo.controller;


import com.yelfly.springdemo.entities.CommonResult;
import com.yelfly.springdemo.entities.Payment;
import com.yelfly.springdemo.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * (Payment)����Ʋ�
 *
 * @author makejava
 * @since 2020-03-06 14:22:26
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("{result}");
        if(result>0){
            return new CommonResult(200,"陈工",result);
        }else {
            return new CommonResult(444,"错误");
        }
    }

    @GetMapping("/get/{id}")
    @ResponseBody
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("****��������{payment}");
        if(payment!=null){
            return new CommonResult(200,"��ѯ�ɹ�",payment);
        }else {
            return new CommonResult(444,"�޼�¼");
        }
    }
}

