package com.xiaofa.dubbo.xml.provider;

import com.alibaba.dubbo.demo.DemoService;

/**
 * @desc:
 * @Author: zhaoyuan
 * @Date: 2019-08-27 11:02
 */
public class XmlDemoProviderServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hello " + name + " by xml";
    }
}
