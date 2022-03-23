package com.puhui.mapper.outsourcing;

import com.puhui.bean.outsourcing.OutsuorcingSpecial;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface OutsuorcingSpecialMapper {
    @Delete({
        "delete from outsuorcing_special",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into outsuorcing_special (id, create_time, ",
        "update_time, outsourcing_timelevel_id, ",
        "outsourcing_org_id, outsourcing_batch_id, ",
        "case_id, asset_request_id, ",
        "state, remark)",
        "values (#{id,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{outsourcingTimelevelId,jdbcType=BIGINT}, ",
        "#{outsourcingOrgId,jdbcType=BIGINT}, #{outsourcingBatchId,jdbcType=BIGINT}, ",
        "#{caseId,jdbcType=BIGINT}, #{assetRequestId,jdbcType=BIGINT}, ",
        "#{state,jdbcType=BIT}, #{remark,jdbcType=VARCHAR})"
    })
    int insert(OutsuorcingSpecial record);

    @Select({
        "select",
        "id, create_time, update_time, outsourcing_timelevel_id, outsourcing_org_id, ",
        "outsourcing_batch_id, case_id, asset_request_id, state, remark",
        "from outsuorcing_special",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="outsourcing_timelevel_id", property="outsourcingTimelevelId", jdbcType=JdbcType.BIGINT),
        @Result(column="outsourcing_org_id", property="outsourcingOrgId", jdbcType=JdbcType.BIGINT),
        @Result(column="outsourcing_batch_id", property="outsourcingBatchId", jdbcType=JdbcType.BIGINT),
        @Result(column="case_id", property="caseId", jdbcType=JdbcType.BIGINT),
        @Result(column="asset_request_id", property="assetRequestId", jdbcType=JdbcType.BIGINT),
        @Result(column="state", property="state", jdbcType=JdbcType.BIT),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    OutsuorcingSpecial selectByPrimaryKey(Integer id);

    @Update({
        "update outsuorcing_special",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "outsourcing_timelevel_id = #{outsourcingTimelevelId,jdbcType=BIGINT},",
          "outsourcing_org_id = #{outsourcingOrgId,jdbcType=BIGINT},",
          "outsourcing_batch_id = #{outsourcingBatchId,jdbcType=BIGINT},",
          "case_id = #{caseId,jdbcType=BIGINT},",
          "asset_request_id = #{assetRequestId,jdbcType=BIGINT},",
          "state = #{state,jdbcType=BIT},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(OutsuorcingSpecial record);
}