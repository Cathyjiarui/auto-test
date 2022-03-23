package com.puhui.mapper.inst;

import com.puhui.bean.inst.InstTaskRepayDesire;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface InstTaskRepayDesireMapper {
    @Delete({
        "delete from inst_task_repay_desire",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into inst_task_repay_desire (id, create_time, ",
        "update_time, inst_rule_track_task_id, ",
        "inst_task_history_id, desire_from, ",
        "status, goal_amount, ",
        "consult_amount, consult_repay_time, ",
        "received_amount, retry_count, ",
        "next_handle_time, case_id, ",
        "reduce_flag)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{instRuleTrackTaskId,jdbcType=BIGINT}, ",
        "#{instTaskHistoryId,jdbcType=BIGINT}, #{desireFrom,jdbcType=TINYINT}, ",
        "#{status,jdbcType=TINYINT}, #{goalAmount,jdbcType=DECIMAL}, ",
        "#{consultAmount,jdbcType=DECIMAL}, #{consultRepayTime,jdbcType=TIMESTAMP}, ",
        "#{receivedAmount,jdbcType=DECIMAL}, #{retryCount,jdbcType=INTEGER}, ",
        "#{nextHandleTime,jdbcType=TIMESTAMP}, #{caseId,jdbcType=BIGINT}, ",
        "#{reduceFlag,jdbcType=BIT})"
    })
    int insert(InstTaskRepayDesire record);

    @Select({
        "select",
        "id, create_time, update_time, inst_rule_track_task_id, inst_task_history_id, ",
        "desire_from, status, goal_amount, consult_amount, consult_repay_time, received_amount, ",
        "retry_count, next_handle_time, case_id, reduce_flag",
        "from inst_task_repay_desire",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="inst_rule_track_task_id", property="instRuleTrackTaskId", jdbcType=JdbcType.BIGINT),
        @Result(column="inst_task_history_id", property="instTaskHistoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="desire_from", property="desireFrom", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="goal_amount", property="goalAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="consult_amount", property="consultAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="consult_repay_time", property="consultRepayTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="received_amount", property="receivedAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="retry_count", property="retryCount", jdbcType=JdbcType.INTEGER),
        @Result(column="next_handle_time", property="nextHandleTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="case_id", property="caseId", jdbcType=JdbcType.BIGINT),
        @Result(column="reduce_flag", property="reduceFlag", jdbcType=JdbcType.BIT)
    })
    InstTaskRepayDesire selectByPrimaryKey(Long id);

    @Update({
        "update inst_task_repay_desire",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "inst_rule_track_task_id = #{instRuleTrackTaskId,jdbcType=BIGINT},",
          "inst_task_history_id = #{instTaskHistoryId,jdbcType=BIGINT},",
          "desire_from = #{desireFrom,jdbcType=TINYINT},",
          "status = #{status,jdbcType=TINYINT},",
          "goal_amount = #{goalAmount,jdbcType=DECIMAL},",
          "consult_amount = #{consultAmount,jdbcType=DECIMAL},",
          "consult_repay_time = #{consultRepayTime,jdbcType=TIMESTAMP},",
          "received_amount = #{receivedAmount,jdbcType=DECIMAL},",
          "retry_count = #{retryCount,jdbcType=INTEGER},",
          "next_handle_time = #{nextHandleTime,jdbcType=TIMESTAMP},",
          "case_id = #{caseId,jdbcType=BIGINT},",
          "reduce_flag = #{reduceFlag,jdbcType=BIT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(InstTaskRepayDesire record);
}