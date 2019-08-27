package com.xiaofa.dubbo.annotation.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.demo.DemoService;
import org.springframework.stereotype.Component;

/**
 * @desc:
 * @Author: zhaoyuan
 * @Date: 2019-08-27 16:07
 */
@Component
public class Consumer {

    @Reference
    private DemoService demoService;

    public String doSayHello(String name) {
        return demoService.sayHello(name);
    }
}