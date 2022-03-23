package com.puhui.mapper.outsourcing;

import com.puhui.bean.outsourcing.OutsourcingTimelevel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface OutsourcingTimelevelMapper {
    @Delete({
        "delete from outsourcing_timelevel",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into outsourcing_timelevel (id, create_time, ",
        "update_time, client_id, ",
        "start_date, end_date, ",
        "closed, out_time_level)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{clientId,jdbcType=BIGINT}, ",
        "#{startDate,jdbcType=TIMESTAMP}, #{endDate,jdbcType=TIMESTAMP}, ",
        "#{closed,jdbcType=BIT}, #{outTimeLevel,jdbcType=BIGINT})"
    })
    int insert(OutsourcingTimelevel record);

    @Select({
        "select",
        "id, create_time, update_time, client_id, start_date, end_date, closed, out_time_level",
        "from outsourcing_timelevel",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="client_id", property="clientId", jdbcType=JdbcType.BIGINT),
        @Result(column="start_date", property="startDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="closed", property="closed", jdbcType=JdbcType.BIT),
        @Result(column="out_time_level", property="outTimeLevel", jdbcType=JdbcType.BIGINT)
    })
    OutsourcingTimelevel selectByPrimaryKey(Long id);

    @Update({
        "update outsourcing_timelevel",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "client_id = #{clientId,jdbcType=BIGINT},",
          "start_date = #{startDate,jdbcType=TIMESTAMP},",
          "end_date = #{endDate,jdbcType=TIMESTAMP},",
          "closed = #{closed,jdbcType=BIT},",
          "out_time_level = #{outTimeLevel,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OutsourcingTimelevel record);
}