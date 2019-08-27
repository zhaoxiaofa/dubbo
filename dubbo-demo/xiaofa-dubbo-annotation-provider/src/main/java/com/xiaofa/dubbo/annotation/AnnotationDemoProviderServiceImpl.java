package com.xiaofa.dubbo.annotation;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.demo.DemoService;

/**
 * @desc:
 * @Author: zhaoyuan
 * @Date: 2019-08-27 11:02
 */
@Service
public class AnnotationDemoProviderServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hello " + name + " by annotation";
    }
}
