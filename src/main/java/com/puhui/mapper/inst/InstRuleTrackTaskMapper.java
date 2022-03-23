package com.puhui.mapper.inst;

import com.puhui.bean.inst.InstRuleTrackTask;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface InstRuleTrackTaskMapper {
    @Delete({
        "delete from inst_rule_track_task",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into inst_rule_track_task (id, create_time, ",
        "update_time, case_id, ",
        "id_no, service_user_id, ",
        "reduce_flag, inst_collection_rule_id, ",
        "accept_case_time, first_track_time, ",
        "next_track_time, last_track_time, ",
        "plan_terminate_time, actual_terminate_time, ",
        "track_count, status, ",
        "status_reason)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{caseId,jdbcType=BIGINT}, ",
        "#{idNo,jdbcType=VARCHAR}, #{serviceUserId,jdbcType=BIGINT}, ",
        "#{reduceFlag,jdbcType=BIT}, #{instCollectionRuleId,jdbcType=BIGINT}, ",
        "#{acceptCaseTime,jdbcType=TIMESTAMP}, #{firstTrackTime,jdbcType=TIMESTAMP}, ",
        "#{nextTrackTime,jdbcType=TIMESTAMP}, #{lastTrackTime,jdbcType=TIMESTAMP}, ",
        "#{planTerminateTime,jdbcType=TIMESTAMP}, #{actualTerminateTime,jdbcType=TIMESTAMP}, ",
        "#{trackCount,jdbcType=INTEGER}, #{status,jdbcType=TINYINT}, ",
        "#{statusReason,jdbcType=VARCHAR})"
    })
    int insert(InstRuleTrackTask record);

    @Select({
        "select",
        "id, create_time, update_time, case_id, id_no, service_user_id, reduce_flag, ",
        "inst_collection_rule_id, accept_case_time, first_track_time, next_track_time, ",
        "last_track_time, plan_terminate_time, actual_terminate_time, track_count, status, ",
        "status_reason",
        "from inst_rule_track_task",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="case_id", property="caseId", jdbcType=JdbcType.BIGINT),
        @Result(column="id_no", property="idNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="service_user_id", property="serviceUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="reduce_flag", property="reduceFlag", jdbcType=JdbcType.BIT),
        @Result(column="inst_collection_rule_id", property="instCollectionRuleId", jdbcType=JdbcType.BIGINT),
        @Result(column="accept_case_time", property="acceptCaseTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="first_track_time", property="firstTrackTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="next_track_time", property="nextTrackTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_track_time", property="lastTrackTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="plan_terminate_time", property="planTerminateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="actual_terminate_time", property="actualTerminateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="track_count", property="trackCount", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="status_reason", property="statusReason", jdbcType=JdbcType.VARCHAR)
    })
    InstRuleTrackTask selectByPrimaryKey(Long id);

    @Update({
        "update inst_rule_track_task",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "case_id = #{caseId,jdbcType=BIGINT},",
          "id_no = #{idNo,jdbcType=VARCHAR},",
          "service_user_id = #{serviceUserId,jdbcType=BIGINT},",
          "reduce_flag = #{reduceFlag,jdbcType=BIT},",
          "inst_collection_rule_id = #{instCollectionRuleId,jdbcType=BIGINT},",
          "accept_case_time = #{acceptCaseTime,jdbcType=TIMESTAMP},",
          "first_track_time = #{firstTrackTime,jdbcType=TIMESTAMP},",
          "next_track_time = #{nextTrackTime,jdbcType=TIMESTAMP},",
          "last_track_time = #{lastTrackTime,jdbcType=TIMESTAMP},",
          "plan_terminate_time = #{planTerminateTime,jdbcType=TIMESTAMP},",
          "actual_terminate_time = #{actualTerminateTime,jdbcType=TIMESTAMP},",
          "track_count = #{trackCount,jdbcType=INTEGER},",
          "status = #{status,jdbcType=TINYINT},",
          "status_reason = #{statusReason,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(InstRuleTrackTask record);
}