package com.puhui.mapper.outsourcing;

import com.puhui.bean.outsourcing.OutsourcingBatch;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface OutsourcingBatchMapper {
    @Delete({
        "delete from outsourcing_batch",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into outsourcing_batch (id, create_time, ",
        "update_time, out_org_id, ",
        "out_package_id, batch_no, ",
        "batch_type, batch_generate_type, ",
        "generate_time, time_align_type, ",
        "send_time, plan_end_time, ",
        "status, send_user_id, ",
        "file_url, unzip_code, ",
        "file_name)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{outOrgId,jdbcType=BIGINT}, ",
        "#{outPackageId,jdbcType=BIGINT}, #{batchNo,jdbcType=VARCHAR}, ",
        "#{batchType,jdbcType=BIGINT}, #{batchGenerateType,jdbcType=BIGINT}, ",
        "#{generateTime,jdbcType=TIMESTAMP}, #{timeAlignType,jdbcType=BIGINT}, ",
        "#{sendTime,jdbcType=TIMESTAMP}, #{planEndTime,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=INTEGER}, #{sendUserId,jdbcType=BIGINT}, ",
        "#{fileUrl,jdbcType=VARCHAR}, #{unzipCode,jdbcType=VARCHAR}, ",
        "#{fileName,jdbcType=VARCHAR})"
    })
    int insert(OutsourcingBatch record);

    @Select({
        "select",
        "id, create_time, update_time, out_org_id, out_package_id, batch_no, batch_type, ",
        "batch_generate_type, generate_time, time_align_type, send_time, plan_end_time, ",
        "status, send_user_id, file_url, unzip_code, file_name",
        "from outsourcing_batch",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="out_org_id", property="outOrgId", jdbcType=JdbcType.BIGINT),
        @Result(column="out_package_id", property="outPackageId", jdbcType=JdbcType.BIGINT),
        @Result(column="batch_no", property="batchNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="batch_type", property="batchType", jdbcType=JdbcType.BIGINT),
        @Result(column="batch_generate_type", property="batchGenerateType", jdbcType=JdbcType.BIGINT),
        @Result(column="generate_time", property="generateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="time_align_type", property="timeAlignType", jdbcType=JdbcType.BIGINT),
        @Result(column="send_time", property="sendTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="plan_end_time", property="planEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="send_user_id", property="sendUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="file_url", property="fileUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="unzip_code", property="unzipCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_name", property="fileName", jdbcType=JdbcType.VARCHAR)
    })
    OutsourcingBatch selectByPrimaryKey(Long id);

    @Update({
        "update outsourcing_batch",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "out_org_id = #{outOrgId,jdbcType=BIGINT},",
          "out_package_id = #{outPackageId,jdbcType=BIGINT},",
          "batch_no = #{batchNo,jdbcType=VARCHAR},",
          "batch_type = #{batchType,jdbcType=BIGINT},",
          "batch_generate_type = #{batchGenerateType,jdbcType=BIGINT},",
          "generate_time = #{generateTime,jdbcType=TIMESTAMP},",
          "time_align_type = #{timeAlignType,jdbcType=BIGINT},",
          "send_time = #{sendTime,jdbcType=TIMESTAMP},",
          "plan_end_time = #{planEndTime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER},",
          "send_user_id = #{sendUserId,jdbcType=BIGINT},",
          "file_url = #{fileUrl,jdbcType=VARCHAR},",
          "unzip_code = #{unzipCode,jdbcType=VARCHAR},",
          "file_name = #{fileName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OutsourcingBatch record);
}