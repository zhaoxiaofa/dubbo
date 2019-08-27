package com.xiaofa.dubbo.annotation.consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @desc:
 * @Author: zhaoyuan
 * @Date: 2019-08-27 15:40
 */

public class AnnotationConsumerAPP {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        System.out.println("AnnotationConsumerAPP start success");

        Consumer consumer = context.getBean(Consumer.class);
        String result = consumer.doSayHello("world");
        System.out.println(result);
    }


}
