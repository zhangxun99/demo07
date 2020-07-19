package com.zhangxun.cloud.services;
import java.util.List;

import com.zhangxun.cloud.entities.Staff;

public interface StaffService {


    int insertSelective(Staff record);



	List<Staff> selectAll();



	List<Staff> getByAll(Staff staff);



}



