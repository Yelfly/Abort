package com.yelfly.springdemo.controller;


import com.yelfly.springdemo.entities.CommonResult;
import com.yelfly.springdemo.entities.Payment;
import com.yelfly.springdemo.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * (Payment)表控制层
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
        log.info("****插入结果：{result}");
        if(result>0){
            return new CommonResult(200,"插入成功",result);
        }else {
            return new CommonResult(444,"插入失败");
        }
    }

    @GetMapping("/get/{id}")
    @ResponseBody
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("****插入结果：{payment}");
        if(payment!=null){
            return new CommonResult(200,"查询成功",payment);
        }else {
            return new CommonResult(444,"无记录");
        }
    }
}

