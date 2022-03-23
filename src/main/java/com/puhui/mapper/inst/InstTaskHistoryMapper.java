package com.puhui.mapper.inst;

import com.puhui.bean.inst.InstTaskHistory;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface InstTaskHistoryMapper {
    @Delete({
        "delete from inst_task_history",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into inst_task_history (id, create_time, ",
        "update_time, inst_rule_track_task_id, ",
        "appoint_track_time, end_track_time, ",
        "status, first_level_status, ",
        "second_level_status, mapping_status, ",
        "mapping_status_desc)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{instRuleTrackTaskId,jdbcType=BIGINT}, ",
        "#{appointTrackTime,jdbcType=TIMESTAMP}, #{endTrackTime,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=TINYINT}, #{firstLevelStatus,jdbcType=VARCHAR}, ",
        "#{secondLevelStatus,jdbcType=VARCHAR}, #{mappingStatus,jdbcType=VARCHAR}, ",
        "#{mappingStatusDesc,jdbcType=VARCHAR})"
    })
    int insert(InstTaskHistory record);

    @Select({
        "select",
        "id, create_time, update_time, inst_rule_track_task_id, appoint_track_time, end_track_time, ",
        "status, first_level_status, second_level_status, mapping_status, mapping_status_desc",
        "from inst_task_history",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="inst_rule_track_task_id", property="instRuleTrackTaskId", jdbcType=JdbcType.BIGINT),
        @Result(column="appoint_track_time", property="appointTrackTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_track_time", property="endTrackTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="first_level_status", property="firstLevelStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="second_level_status", property="secondLevelStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="mapping_status", property="mappingStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="mapping_status_desc", property="mappingStatusDesc", jdbcType=JdbcType.VARCHAR)
    })
    InstTaskHistory selectByPrimaryKey(Long id);

    @Update({
        "update inst_task_history",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "inst_rule_track_task_id = #{instRuleTrackTaskId,jdbcType=BIGINT},",
          "appoint_track_time = #{appointTrackTime,jdbcType=TIMESTAMP},",
          "end_track_time = #{endTrackTime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=TINYINT},",
          "first_level_status = #{firstLevelStatus,jdbcType=VARCHAR},",
          "second_level_status = #{secondLevelStatus,jdbcType=VARCHAR},",
          "mapping_status = #{mappingStatus,jdbcType=VARCHAR},",
          "mapping_status_desc = #{mappingStatusDesc,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(InstTaskHistory record);
}