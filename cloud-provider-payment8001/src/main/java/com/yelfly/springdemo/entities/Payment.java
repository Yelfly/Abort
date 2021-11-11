package com.yelfly.springdemo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Payment) µÃÂ¿‡
 *
 * @author makejava
 * @since 2020-03-06 14:22:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable{
    private long id;
    private String serial;
}
