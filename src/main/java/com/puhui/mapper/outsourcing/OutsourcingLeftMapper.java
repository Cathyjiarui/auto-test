package com.puhui.mapper.outsourcing;

import com.puhui.bean.outsourcing.OutsourcingLeft;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface OutsourcingLeftMapper {
    @Delete({
        "delete from outsourcing_left",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into outsourcing_left (id, create_time, ",
        "update_time, outsourcing_timelevel_id, ",
        "outsourcing_org_id, outsourcing_batch_id, ",
        "case_id, core_request_id, ",
        "status, remark)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{outsourcingTimelevelId,jdbcType=BIGINT}, ",
        "#{outsourcingOrgId,jdbcType=BIGINT}, #{outsourcingBatchId,jdbcType=BIGINT}, ",
        "#{caseId,jdbcType=BIGINT}, #{coreRequestId,jdbcType=BIGINT}, ",
        "#{status,jdbcType=TINYINT}, #{remark,jdbcType=VARCHAR})"
    })
    int insert(OutsourcingLeft record);

    @Select({
        "select",
        "id, create_time, update_time, outsourcing_timelevel_id, outsourcing_org_id, ",
        "outsourcing_batch_id, case_id, core_request_id, status, remark",
        "from outsourcing_left",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="outsourcing_timelevel_id", property="outsourcingTimelevelId", jdbcType=JdbcType.BIGINT),
        @Result(column="outsourcing_org_id", property="outsourcingOrgId", jdbcType=JdbcType.BIGINT),
        @Result(column="outsourcing_batch_id", property="outsourcingBatchId", jdbcType=JdbcType.BIGINT),
        @Result(column="case_id", property="caseId", jdbcType=JdbcType.BIGINT),
        @Result(column="core_request_id", property="coreRequestId", jdbcType=JdbcType.BIGINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    OutsourcingLeft selectByPrimaryKey(Long id);

    @Update({
        "update outsourcing_left",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "outsourcing_timelevel_id = #{outsourcingTimelevelId,jdbcType=BIGINT},",
          "outsourcing_org_id = #{outsourcingOrgId,jdbcType=BIGINT},",
          "outsourcing_batch_id = #{outsourcingBatchId,jdbcType=BIGINT},",
          "case_id = #{caseId,jdbcType=BIGINT},",
          "core_request_id = #{coreRequestId,jdbcType=BIGINT},",
          "status = #{status,jdbcType=TINYINT},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OutsourcingLeft record);
}