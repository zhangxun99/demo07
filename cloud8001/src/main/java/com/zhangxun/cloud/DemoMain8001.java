package com.zhangxun.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(DemoMain8001.class,args);
    }
}
