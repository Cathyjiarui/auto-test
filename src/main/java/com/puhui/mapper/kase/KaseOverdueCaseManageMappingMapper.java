package com.puhui.mapper.kase;

import com.puhui.bean.kase.KaseOverdueCaseManageMapping;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface KaseOverdueCaseManageMappingMapper {
    @Delete({
        "delete from kase_overdue_case_manage_mapping",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into kase_overdue_case_manage_mapping (id, create_time, ",
        "update_time, kase_overdue_id, ",
        "case_id)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{kaseOverdueId,jdbcType=BIGINT}, ",
        "#{caseId,jdbcType=BIGINT})"
    })
    int insert(KaseOverdueCaseManageMapping record);

    @Select({
        "select",
        "id, create_time, update_time, kase_overdue_id, case_id",
        "from kase_overdue_case_manage_mapping",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="kase_overdue_id", property="kaseOverdueId", jdbcType=JdbcType.BIGINT),
        @Result(column="case_id", property="caseId", jdbcType=JdbcType.BIGINT)
    })
    KaseOverdueCaseManageMapping selectByPrimaryKey(Long id);

    @Update({
        "update kase_overdue_case_manage_mapping",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "kase_overdue_id = #{kaseOverdueId,jdbcType=BIGINT},",
          "case_id = #{caseId,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(KaseOverdueCaseManageMapping record);
}