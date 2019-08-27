package com.xiaofa.dubbo.xml.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @desc:
 * @Author: zhaoyuan
 * @Date: 2019-08-27 11:54
 */
public class XmlProviderApp {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(new String[]{"spring/provider.xml"});
        classPathXmlApplicationContext.start();
        System.out.println("XmlProviderApp start success");
        System.in.read();
    }

}
