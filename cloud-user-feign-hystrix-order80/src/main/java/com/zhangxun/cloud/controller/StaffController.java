package com.zhangxun.cloud.controller;

import com.zhangxun.cloud.service.StaffHystrixFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class StaffController {
    @Resource
    StaffHystrixFeignService staffHystrixFeignService;

    @GetMapping("/hystrix/staff_OK/")
    public String staff_OK(@RequestParam("id") Integer id) {

        return staffHystrixFeignService.staff_OK(id);
    }

    @GetMapping("/hystrix/staff_timeOut/")
    public String staff_timeOut(@RequestParam("id") Integer id) {
        return  staffHystrixFeignService.staff_timeOut(id);
    }
}
