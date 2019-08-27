package com.xiaofa.dubbo.annotation;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @desc:
 * @Author: zhaoyuan
 * @Date: 2019-08-27 16:02
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.xiaofa.dubbo.annotation")
@PropertySource("classpath:/spring/dubbo-provider.properties")
public class AnnotationProviderConfig {



}


