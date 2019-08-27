package com.xiaofa.dubbo.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnnotationProviderApp {

    public static void main(String[] args) throws Exception {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationProviderConfig.class);
        context.start();
        System.in.read();
    }

}
