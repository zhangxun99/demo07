package com.zhangxun.cloud.service;

import com.zhangxun.cloud.entities.Staff;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient("CLOUD-SERVICE")
public interface StaffFeignService {
    @PostMapping("/selectAllToStaff")
    public Object selectAllToStaff(@RequestBody Staff staff);
}
