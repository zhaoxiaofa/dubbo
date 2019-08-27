package com.xiaofa.dubbo.api.consumer;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.demo.DemoService;

/**
 * @desc:
 * @Author: zhaoyuan
 * @Date: 2019-08-27 14:43
 */
public class ApiConsumerApp {

    public static void main(String[] args) {

        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("xiaofa-dubbo-api-consumer");

        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("192.168.1.117:2181");
        registryConfig.setProtocol("zookeeper");

        ReferenceConfig referenceConfig = new ReferenceConfig();

        referenceConfig.setInterface(DemoService.class);
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setRegistry(registryConfig);

        DemoService demoService = (DemoService) referenceConfig.get();
        String result = demoService.sayHello("world");
        System.out.println(result);

    }
}
