package com.zhangxun.cloud.controller;

import com.zhangxun.cloud.entities.Staff;
import com.zhangxun.cloud.service.StaffFeignService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderFeignController {
    @Resource
    StaffFeignService staffFeignService;
    @PostMapping("/user/selectAllToStaff")
    public Object selectAllToStaff(@RequestBody Staff staff){
        return staffFeignService.selectAllToStaff(staff);
    }

}
