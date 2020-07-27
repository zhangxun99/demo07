package com.zhangxun.cloud.controller;

import com.zhangxun.cloud.service.StaffService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class StaffController {
    @Resource
    StaffService staffService;
    @GetMapping("/hystrix/staff_OK/")
    public String staff_OK(@RequestParam("id") Integer id){
        return staffService.staff_OK(id);
    }

    @GetMapping("/hystrix/staff_timeOut/")
    public String staff_timeOut(@RequestParam("id") Integer id){
        return staffService.staff_TimeOut(id);
    }
}
