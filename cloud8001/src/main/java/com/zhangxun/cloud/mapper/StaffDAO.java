package com.zhangxun.cloud.mapper;
import java.util.List;

import com.zhangxun.cloud.entities.Staff;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StaffDAO {

    int insertSelective(Staff record);

    List<Staff> selectAll();

    List<Staff> getByAll(Staff staff);



}