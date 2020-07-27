package com.zhangxun.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import java.util.concurrent.TimeUnit;

@Service
@DefaultProperties
public class StaffService {

    @HystrixCommand
    public String staff_OK(Integer id){
        return "线程池"+ Thread.currentThread().getName()+"\t"+"staff_OK,id:"+id+"\t"+"O(∩_∩)O";
    }

    @HystrixCommand
    public String staff_TimeOut(Integer id){
        int timeNumber = 3000;
        try {
            TimeUnit.MILLISECONDS.sleep(timeNumber);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池"+ Thread.currentThread().getName()+"\t"+"staff_TimeOut,id:"+id+"\t"+"/(ㄒoㄒ)/~~";
    }

}
