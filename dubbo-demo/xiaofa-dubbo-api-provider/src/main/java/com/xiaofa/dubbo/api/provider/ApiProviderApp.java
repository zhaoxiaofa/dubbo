package com.xiaofa.dubbo.api.provider;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.alibaba.dubbo.demo.DemoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @desc:
 * @Author: zhaoyuan
 * @Date: 2019-08-27 11:54
 */
public class ApiProviderApp {

    public static void main(String[] args) throws IOException {

        DemoService demoService = new ApiDemoProviderServiceImpl();

        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("xiaofa-dubbo-api-provider");

        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("192.168.1.117:2181");
        registryConfig.setProtocol("zookeeper");

        ProtocolConfig protocol = new ProtocolConfig();
        protocol.setName("dubbo");
        protocol.setPort(20881);

        ServiceConfig serviceConfig = new ServiceConfig();

        serviceConfig.setApplication(applicationConfig);
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setProtocol(protocol);

        serviceConfig.setInterface(DemoService.class);
        serviceConfig.setRef(demoService);

        serviceConfig.export();
        System.out.println("ApiProviderApp start success");
        System.in.read();
    }

}
