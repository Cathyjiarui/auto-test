package com.puhui.mapper.inst;

import com.puhui.bean.inst.InstJobLog;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface InstJobLogMapper {
    @Delete({
        "delete from inst_job_log",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into inst_job_log (id, create_time, ",
        "update_time, job_id, ",
        "execute_date, start_time, ",
        "end_time, total_count, ",
        "success_count, error_count, ",
        "execution_type, executor, ",
        "execution_status)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{jobId,jdbcType=BIGINT}, ",
        "#{executeDate,jdbcType=INTEGER}, #{startTime,jdbcType=TIMESTAMP}, ",
        "#{endTime,jdbcType=TIMESTAMP}, #{totalCount,jdbcType=INTEGER}, ",
        "#{successCount,jdbcType=INTEGER}, #{errorCount,jdbcType=INTEGER}, ",
        "#{executionType,jdbcType=TINYINT}, #{executor,jdbcType=VARCHAR}, ",
        "#{executionStatus,jdbcType=TINYINT})"
    })
    int insert(InstJobLog record);

    @Select({
        "select",
        "id, create_time, update_time, job_id, execute_date, start_time, end_time, total_count, ",
        "success_count, error_count, execution_type, executor, execution_status",
        "from inst_job_log",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="job_id", property="jobId", jdbcType=JdbcType.BIGINT),
        @Result(column="execute_date", property="executeDate", jdbcType=JdbcType.INTEGER),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="total_count", property="totalCount", jdbcType=JdbcType.INTEGER),
        @Result(column="success_count", property="successCount", jdbcType=JdbcType.INTEGER),
        @Result(column="error_count", property="errorCount", jdbcType=JdbcType.INTEGER),
        @Result(column="execution_type", property="executionType", jdbcType=JdbcType.TINYINT),
        @Result(column="executor", property="executor", jdbcType=JdbcType.VARCHAR),
        @Result(column="execution_status", property="executionStatus", jdbcType=JdbcType.TINYINT)
    })
    InstJobLog selectByPrimaryKey(Long id);

    @Update({
        "update inst_job_log",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "job_id = #{jobId,jdbcType=BIGINT},",
          "execute_date = #{executeDate,jdbcType=INTEGER},",
          "start_time = #{startTime,jdbcType=TIMESTAMP},",
          "end_time = #{endTime,jdbcType=TIMESTAMP},",
          "total_count = #{totalCount,jdbcType=INTEGER},",
          "success_count = #{successCount,jdbcType=INTEGER},",
          "error_count = #{errorCount,jdbcType=INTEGER},",
          "execution_type = #{executionType,jdbcType=TINYINT},",
          "executor = #{executor,jdbcType=VARCHAR},",
          "execution_status = #{executionStatus,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(InstJobLog record);
}