package com.puhui.mapper.repay;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.puhui.bean.repay.RepayCaseManage;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface RepayCaseManageMapper extends BaseMapper<RepayCaseManage> {

    @Select("SELECT * FROM repay_case_manage WHERE id = #{id}")
    RepayCaseManage getCase(@Param("id") String id);

    @Update("UPDATE repay_case_manage rcm SET rcm.`status` = 2 WHERE rcm.`core_request_id` = #{core_request_id}")
    boolean UpdateStatus(@Param("core_request_id") String core_request_id);
}