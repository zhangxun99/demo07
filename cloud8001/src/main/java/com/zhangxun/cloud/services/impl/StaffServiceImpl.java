package com.zhangxun.cloud.services.impl;
import java.util.List;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhangxun.cloud.entities.Staff;
import com.zhangxun.cloud.mapper.StaffDAO;
import com.zhangxun.cloud.services.StaffService;

@Service
public class StaffServiceImpl implements StaffService {

    @Resource
    private StaffDAO staffDAO;

    @Override
    public int insertSelective(Staff record) {
        return staffDAO.insertSelective(record);
    }

	@Override
	public List<Staff> selectAll(){
		 return staffDAO.selectAll();
	}

	@Override
	public List<Staff> getByAll(Staff staff){
		 return staffDAO.getByAll(staff);
	}







}



