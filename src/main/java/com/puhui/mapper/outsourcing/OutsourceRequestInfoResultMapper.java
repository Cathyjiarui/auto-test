package com.puhui.mapper.outsourcing;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.puhui.bean.outsourcing.OutsourceRequestInfoResult;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface OutsourceRequestInfoResultMapper extends BaseMapper<OutsourceRequestInfoResult> {
}