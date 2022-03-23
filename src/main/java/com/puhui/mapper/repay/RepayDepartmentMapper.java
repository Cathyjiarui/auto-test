package com.puhui.mapper.repay;

import com.puhui.bean.repay.RepayDepartment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RepayDepartmentMapper {

    @Select("SELECT * FROM repay_department WHERE name = #{name}")
    RepayDepartment getUcOrgId(@Param("name") String name);
}
