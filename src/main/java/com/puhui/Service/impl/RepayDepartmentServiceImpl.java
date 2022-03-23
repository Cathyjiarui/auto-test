package com.puhui.Service.impl;

import com.puhui.Service.RepayDepartmentService;
import com.puhui.bean.repay.RepayDepartment;
import com.puhui.mapper.repay.RepayDepartmentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName RepayDepartmentServiceImpl
 * @Description TODO
 * @Author JiaZhang
 * @Date 2018/12/26 6:12 PM
 * @Version 1.0
 **/
@Service
public class RepayDepartmentServiceImpl implements RepayDepartmentService {

    @Resource
    private RepayDepartmentMapper repayDepartmentMapper;

    @Override
    public RepayDepartment getUcOrgId(String name){
        return repayDepartmentMapper.getUcOrgId(name);
    }
}
