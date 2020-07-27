package com.zhangxun.cloud.service;

import org.springframework.stereotype.Component;

@Component
public class StaffFallbackService implements StaffHystrixFeignService {

    @Override
    public String staff_OK(Integer id) {
        return "staff_OK----fallback---/(ㄒoㄒ)/~~";
    }

    @Override
    public String staff_timeOut(Integer id) {
        return "staff_timeOut----fallback---/(ㄒoㄒ)/~~";
    }
}
