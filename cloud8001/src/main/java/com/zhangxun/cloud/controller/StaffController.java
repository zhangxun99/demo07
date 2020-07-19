package com.zhangxun.cloud.controller;

import com.zhangxun.cloud.entities.Staff;
import com.zhangxun.cloud.services.StaffService;
import com.zhangxun.cloud.until.BaseClass;
import com.zhangxun.cloud.until.RestUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;

@RestController
@RequestMapping("")
public class StaffController {
    @Resource
    private StaffService staffService;
    @Value("${server.port}")
    private String savePort;

    @PostMapping("/selectAllToStaff")
    public Object selectAllToStaff(@RequestBody Staff staff){
        List<Staff> byAll = staffService.getByAll(staff);
        LinkedHashMap success = RestUtil.SUCCESS(byAll);
        success.put("serverPort",savePort);
        return success;
    }

    @PutMapping("/save")
    public Object saveStaff(@RequestBody Staff staff){
        int i = staffService.insertSelective(staff);
        return i<0? RestUtil.ERROR(BaseClass.ERROR_CODE,"操作失败"):RestUtil.SUCCESS();
    }

}
