package com.xiaofa.dubbo.annotation.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @desc:
 * @Author: zhaoyuan
 * @Date: 2019-08-27 15:53
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.xiaofa.dubbo.annotation.consumer")
@PropertySource("classpath:/spring/dubbo-consumer.properties")
@ComponentScan(value = {"com.xiaofa.dubbo.annotation.consumer"})
public class ConsumerConfiguration {


}
