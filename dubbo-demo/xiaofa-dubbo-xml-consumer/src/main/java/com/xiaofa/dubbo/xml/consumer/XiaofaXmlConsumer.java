package com.xiaofa.dubbo.xml.consumer;

import com.alibaba.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @desc:
 * @Author: zhaoyuan
 * @Date: 2019-08-27 13:35
 */
public class XiaofaXmlConsumer {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(new String[]{"/spring/consumer.xml"});
        classPathXmlApplicationContext.start();
        DemoService demoService = (DemoService) classPathXmlApplicationContext.getBean("xiaofaDemoService");
        String result = demoService.sayHello("world");
        System.out.println(result);
    }

}
