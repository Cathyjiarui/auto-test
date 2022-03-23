package com.puhui.mapper.outsourcing;

import com.puhui.bean.outsourcing.OutsourcingSendRecord;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface OutsourcingSendRecordMapper {
    @Delete({
        "delete from outsourcing_send_record",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into outsourcing_send_record (id, create_time, ",
        "update_time, out_org_id, ",
        "out_kase_id, out_batch_id, ",
        "kase_batch_relation_id, start_out_date, ",
        "end_out_date, out_type, ",
        "status, org_batch_no, ",
        "resp_result, revoke_result)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{outOrgId,jdbcType=BIGINT}, ",
        "#{outKaseId,jdbcType=BIGINT}, #{outBatchId,jdbcType=BIGINT}, ",
        "#{kaseBatchRelationId,jdbcType=BIGINT}, #{startOutDate,jdbcType=TIMESTAMP}, ",
        "#{endOutDate,jdbcType=TIMESTAMP}, #{outType,jdbcType=TINYINT}, ",
        "#{status,jdbcType=TINYINT}, #{orgBatchNo,jdbcType=VARCHAR}, ",
        "#{respResult,jdbcType=VARCHAR}, #{revokeResult,jdbcType=VARCHAR})"
    })
    int insert(OutsourcingSendRecord record);

    @Select({
        "select",
        "id, create_time, update_time, out_org_id, out_kase_id, out_batch_id, kase_batch_relation_id, ",
        "start_out_date, end_out_date, out_type, status, org_batch_no, resp_result, revoke_result",
        "from outsourcing_send_record",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="out_org_id", property="outOrgId", jdbcType=JdbcType.BIGINT),
        @Result(column="out_kase_id", property="outKaseId", jdbcType=JdbcType.BIGINT),
        @Result(column="out_batch_id", property="outBatchId", jdbcType=JdbcType.BIGINT),
        @Result(column="kase_batch_relation_id", property="kaseBatchRelationId", jdbcType=JdbcType.BIGINT),
        @Result(column="start_out_date", property="startOutDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_out_date", property="endOutDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="out_type", property="outType", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="org_batch_no", property="orgBatchNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="resp_result", property="respResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="revoke_result", property="revokeResult", jdbcType=JdbcType.VARCHAR)
    })
    OutsourcingSendRecord selectByPrimaryKey(Long id);

    @Update({
        "update outsourcing_send_record",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "out_org_id = #{outOrgId,jdbcType=BIGINT},",
          "out_kase_id = #{outKaseId,jdbcType=BIGINT},",
          "out_batch_id = #{outBatchId,jdbcType=BIGINT},",
          "kase_batch_relation_id = #{kaseBatchRelationId,jdbcType=BIGINT},",
          "start_out_date = #{startOutDate,jdbcType=TIMESTAMP},",
          "end_out_date = #{endOutDate,jdbcType=TIMESTAMP},",
          "out_type = #{outType,jdbcType=TINYINT},",
          "status = #{status,jdbcType=TINYINT},",
          "org_batch_no = #{orgBatchNo,jdbcType=VARCHAR},",
          "resp_result = #{respResult,jdbcType=VARCHAR},",
          "revoke_result = #{revokeResult,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OutsourcingSendRecord record);
}