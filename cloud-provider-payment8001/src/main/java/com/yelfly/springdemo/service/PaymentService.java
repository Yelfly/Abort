package com.yelfly.springdemo.service;




import com.yelfly.springdemo.entities.Payment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Payment)表服务接口
 *
 * @author makejava
 * @since 2020-03-06 14:22:26
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
