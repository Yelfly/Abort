package com.yelfly.springdemo.service.impl;


import com.yelfly.springdemo.dao.PaymentDao;
import com.yelfly.springdemo.entities.Payment;
import com.yelfly.springdemo.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Payment)表服务实现类
 *
 * @author makejava
 * @since 2020-03-06 14:22:26
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }



}