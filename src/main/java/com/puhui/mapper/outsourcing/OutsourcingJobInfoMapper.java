package com.puhui.mapper.outsourcing;

import com.puhui.bean.outsourcing.OutsourcingJobInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface OutsourcingJobInfoMapper {
    @Delete({
        "delete from outsourcing_job_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into outsourcing_job_info (id, create_time, ",
        "update_time, job_name, ",
        "parent_id, cron, job_desc, ",
        "job_class, job_status, ",
        "sequence)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{jobName,jdbcType=VARCHAR}, ",
        "#{parentId,jdbcType=BIGINT}, #{cron,jdbcType=VARCHAR}, #{jobDesc,jdbcType=VARCHAR}, ",
        "#{jobClass,jdbcType=VARCHAR}, #{jobStatus,jdbcType=TINYINT}, ",
        "#{sequence,jdbcType=INTEGER})"
    })
    int insert(OutsourcingJobInfo record);

    @Select({
        "select",
        "id, create_time, update_time, job_name, parent_id, cron, job_desc, job_class, ",
        "job_status, sequence",
        "from outsourcing_job_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.BIGINT),
        @Result(column="cron", property="cron", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_desc", property="jobDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_class", property="jobClass", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_status", property="jobStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="sequence", property="sequence", jdbcType=JdbcType.INTEGER)
    })
    OutsourcingJobInfo selectByPrimaryKey(Long id);

    @Update({
        "update outsourcing_job_info",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "job_name = #{jobName,jdbcType=VARCHAR},",
          "parent_id = #{parentId,jdbcType=BIGINT},",
          "cron = #{cron,jdbcType=VARCHAR},",
          "job_desc = #{jobDesc,jdbcType=VARCHAR},",
          "job_class = #{jobClass,jdbcType=VARCHAR},",
          "job_status = #{jobStatus,jdbcType=TINYINT},",
          "sequence = #{sequence,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OutsourcingJobInfo record);
}