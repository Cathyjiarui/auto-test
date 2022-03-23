package com.puhui.mapper.outsourcing;

import com.puhui.bean.outsourcing.OutsourcingKaseBatchRelation;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface OutsourcingKaseBatchRelationMapper {
    @Delete({
        "delete from outsourcing_kase_batch_relation",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into outsourcing_kase_batch_relation (id, create_time, ",
        "update_time, send_time, ",
        "kase_package_id, out_kase_id, ",
        "out_batch_id, entry_batch_type, ",
        "status, revoke_reason, ",
        "send_square_up, send_surplus_principal, ",
        "send_overdue_period, send_this_cycle, ",
        "send_lend_phase, send_overdue_total, ",
        "send_overdue_principal_interest, end_surplus_principal, ",
        "end_square_up, end_this_cycle, ",
        "end_lend_phase, end_overdue_period, ",
        "end_overdue_principal_interest, end_overdue_total)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{sendTime,jdbcType=TIMESTAMP}, ",
        "#{kasePackageId,jdbcType=BIGINT}, #{outKaseId,jdbcType=BIGINT}, ",
        "#{outBatchId,jdbcType=BIGINT}, #{entryBatchType,jdbcType=BIGINT}, ",
        "#{status,jdbcType=BIGINT}, #{revokeReason,jdbcType=VARCHAR}, ",
        "#{sendSquareUp,jdbcType=DOUBLE}, #{sendSurplusPrincipal,jdbcType=DOUBLE}, ",
        "#{sendOverduePeriod,jdbcType=DOUBLE}, #{sendThisCycle,jdbcType=DOUBLE}, ",
        "#{sendLendPhase,jdbcType=DOUBLE}, #{sendOverdueTotal,jdbcType=DOUBLE}, ",
        "#{sendOverduePrincipalInterest,jdbcType=DOUBLE}, #{endSurplusPrincipal,jdbcType=DOUBLE}, ",
        "#{endSquareUp,jdbcType=DOUBLE}, #{endThisCycle,jdbcType=DOUBLE}, ",
        "#{endLendPhase,jdbcType=DOUBLE}, #{endOverduePeriod,jdbcType=DOUBLE}, ",
        "#{endOverduePrincipalInterest,jdbcType=DOUBLE}, #{endOverdueTotal,jdbcType=DOUBLE})"
    })
    int insert(OutsourcingKaseBatchRelation record);

    @Select({
        "select",
        "id, create_time, update_time, send_time, kase_package_id, out_kase_id, out_batch_id, ",
        "entry_batch_type, status, revoke_reason, send_square_up, send_surplus_principal, ",
        "send_overdue_period, send_this_cycle, send_lend_phase, send_overdue_total, send_overdue_principal_interest, ",
        "end_surplus_principal, end_square_up, end_this_cycle, end_lend_phase, end_overdue_period, ",
        "end_overdue_principal_interest, end_overdue_total",
        "from outsourcing_kase_batch_relation",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="send_time", property="sendTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="kase_package_id", property="kasePackageId", jdbcType=JdbcType.BIGINT),
        @Result(column="out_kase_id", property="outKaseId", jdbcType=JdbcType.BIGINT),
        @Result(column="out_batch_id", property="outBatchId", jdbcType=JdbcType.BIGINT),
        @Result(column="entry_batch_type", property="entryBatchType", jdbcType=JdbcType.BIGINT),
        @Result(column="status", property="status", jdbcType=JdbcType.BIGINT),
        @Result(column="revoke_reason", property="revokeReason", jdbcType=JdbcType.VARCHAR),
        @Result(column="send_square_up", property="sendSquareUp", jdbcType=JdbcType.DOUBLE),
        @Result(column="send_surplus_principal", property="sendSurplusPrincipal", jdbcType=JdbcType.DOUBLE),
        @Result(column="send_overdue_period", property="sendOverduePeriod", jdbcType=JdbcType.DOUBLE),
        @Result(column="send_this_cycle", property="sendThisCycle", jdbcType=JdbcType.DOUBLE),
        @Result(column="send_lend_phase", property="sendLendPhase", jdbcType=JdbcType.DOUBLE),
        @Result(column="send_overdue_total", property="sendOverdueTotal", jdbcType=JdbcType.DOUBLE),
        @Result(column="send_overdue_principal_interest", property="sendOverduePrincipalInterest", jdbcType=JdbcType.DOUBLE),
        @Result(column="end_surplus_principal", property="endSurplusPrincipal", jdbcType=JdbcType.DOUBLE),
        @Result(column="end_square_up", property="endSquareUp", jdbcType=JdbcType.DOUBLE),
        @Result(column="end_this_cycle", property="endThisCycle", jdbcType=JdbcType.DOUBLE),
        @Result(column="end_lend_phase", property="endLendPhase", jdbcType=JdbcType.DOUBLE),
        @Result(column="end_overdue_period", property="endOverduePeriod", jdbcType=JdbcType.DOUBLE),
        @Result(column="end_overdue_principal_interest", property="endOverduePrincipalInterest", jdbcType=JdbcType.DOUBLE),
        @Result(column="end_overdue_total", property="endOverdueTotal", jdbcType=JdbcType.DOUBLE)
    })
    OutsourcingKaseBatchRelation selectByPrimaryKey(Long id);

    @Update({
        "update outsourcing_kase_batch_relation",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "send_time = #{sendTime,jdbcType=TIMESTAMP},",
          "kase_package_id = #{kasePackageId,jdbcType=BIGINT},",
          "out_kase_id = #{outKaseId,jdbcType=BIGINT},",
          "out_batch_id = #{outBatchId,jdbcType=BIGINT},",
          "entry_batch_type = #{entryBatchType,jdbcType=BIGINT},",
          "status = #{status,jdbcType=BIGINT},",
          "revoke_reason = #{revokeReason,jdbcType=VARCHAR},",
          "send_square_up = #{sendSquareUp,jdbcType=DOUBLE},",
          "send_surplus_principal = #{sendSurplusPrincipal,jdbcType=DOUBLE},",
          "send_overdue_period = #{sendOverduePeriod,jdbcType=DOUBLE},",
          "send_this_cycle = #{sendThisCycle,jdbcType=DOUBLE},",
          "send_lend_phase = #{sendLendPhase,jdbcType=DOUBLE},",
          "send_overdue_total = #{sendOverdueTotal,jdbcType=DOUBLE},",
          "send_overdue_principal_interest = #{sendOverduePrincipalInterest,jdbcType=DOUBLE},",
          "end_surplus_principal = #{endSurplusPrincipal,jdbcType=DOUBLE},",
          "end_square_up = #{endSquareUp,jdbcType=DOUBLE},",
          "end_this_cycle = #{endThisCycle,jdbcType=DOUBLE},",
          "end_lend_phase = #{endLendPhase,jdbcType=DOUBLE},",
          "end_overdue_period = #{endOverduePeriod,jdbcType=DOUBLE},",
          "end_overdue_principal_interest = #{endOverduePrincipalInterest,jdbcType=DOUBLE},",
          "end_overdue_total = #{endOverdueTotal,jdbcType=DOUBLE}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OutsourcingKaseBatchRelation record);
}