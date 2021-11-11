package com.yelfly.springdemo.dao;


import com.yelfly.springdemo.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**CommonResult
 Payment
 * (Payment)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-06 14:22:26
 */

@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
