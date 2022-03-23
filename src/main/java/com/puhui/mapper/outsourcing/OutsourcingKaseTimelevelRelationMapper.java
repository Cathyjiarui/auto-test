package com.puhui.mapper.outsourcing;

import com.puhui.bean.outsourcing.OutsourcingKaseTimelevelRelation;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface OutsourcingKaseTimelevelRelationMapper {
    @Delete({
        "delete from outsourcing_kase_timelevel_relation",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into outsourcing_kase_timelevel_relation (id, create_time, ",
        "update_time, out_timelevel_id, ",
        "out_kase_id)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{outTimelevelId,jdbcType=BIGINT}, ",
        "#{outKaseId,jdbcType=BIGINT})"
    })
    int insert(OutsourcingKaseTimelevelRelation record);

    @Select({
        "select",
        "id, create_time, update_time, out_timelevel_id, out_kase_id",
        "from outsourcing_kase_timelevel_relation",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="out_timelevel_id", property="outTimelevelId", jdbcType=JdbcType.BIGINT),
        @Result(column="out_kase_id", property="outKaseId", jdbcType=JdbcType.BIGINT)
    })
    OutsourcingKaseTimelevelRelation selectByPrimaryKey(Long id);

    @Update({
        "update outsourcing_kase_timelevel_relation",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "out_timelevel_id = #{outTimelevelId,jdbcType=BIGINT},",
          "out_kase_id = #{outKaseId,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OutsourcingKaseTimelevelRelation record);
}