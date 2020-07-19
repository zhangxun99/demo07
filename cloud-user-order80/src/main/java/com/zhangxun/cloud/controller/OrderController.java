package com.zhangxun.cloud.controller;

import com.zhangxun.cloud.entities.Staff;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController

public class OrderController {
    public static final String CLOUD_URL = "http://CLOUD-SERVICE";

    @Resource
    private RestTemplate restTemplate;
    @PostMapping("/user/staff/selectAllToStaff")
    public Object getStaff(@RequestBody Staff staff){
        return restTemplate.postForEntity(CLOUD_URL+"/selectAllToStaff",staff,Object.class);
    }
}
