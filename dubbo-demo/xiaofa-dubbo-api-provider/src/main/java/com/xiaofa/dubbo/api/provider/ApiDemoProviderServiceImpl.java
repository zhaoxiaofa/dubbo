package com.xiaofa.dubbo.api.provider;

import com.alibaba.dubbo.demo.DemoService;

/**
 * @desc:
 * @Author: zhaoyuan
 * @Date: 2019-08-27 11:02
 */
public class ApiDemoProviderServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hello " + name + " by api";
    }
}
