package com.zhangxun.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-SERVICE",fallback = StaffFallbackService.class)
public interface StaffHystrixFeignService {

    @GetMapping("/hystrix/staff_OK/")
    public String staff_OK(@RequestParam("id") Integer id);

    @GetMapping("/hystrix/staff_timeOut/")
    public String staff_timeOut(@RequestParam("id") Integer id);
}
