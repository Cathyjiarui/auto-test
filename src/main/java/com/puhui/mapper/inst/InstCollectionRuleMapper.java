package com.puhui.mapper.inst;

import com.puhui.bean.inst.InstCollectionRule;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface InstCollectionRuleMapper {
    @Delete({
        "delete from inst_collection_rule",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into inst_collection_rule (id, create_time, ",
        "update_time, inst_collection_tool_id, ",
        "name, cron, reduce_flag, ",
        "dimension_flag, sms_template_id)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{instCollectionToolId,jdbcType=BIGINT}, ",
        "#{name,jdbcType=VARCHAR}, #{cron,jdbcType=VARCHAR}, #{reduceFlag,jdbcType=BIT}, ",
        "#{dimensionFlag,jdbcType=TINYINT}, #{smsTemplateId,jdbcType=BIGINT})"
    })
    int insert(InstCollectionRule record);

    @Select({
        "select",
        "id, create_time, update_time, inst_collection_tool_id, name, cron, reduce_flag, ",
        "dimension_flag, sms_template_id",
        "from inst_collection_rule",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="inst_collection_tool_id", property="instCollectionToolId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="cron", property="cron", jdbcType=JdbcType.VARCHAR),
        @Result(column="reduce_flag", property="reduceFlag", jdbcType=JdbcType.BIT),
        @Result(column="dimension_flag", property="dimensionFlag", jdbcType=JdbcType.TINYINT),
        @Result(column="sms_template_id", property="smsTemplateId", jdbcType=JdbcType.BIGINT)
    })
    InstCollectionRule selectByPrimaryKey(Long id);

    @Update({
        "update inst_collection_rule",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "inst_collection_tool_id = #{instCollectionToolId,jdbcType=BIGINT},",
          "name = #{name,jdbcType=VARCHAR},",
          "cron = #{cron,jdbcType=VARCHAR},",
          "reduce_flag = #{reduceFlag,jdbcType=BIT},",
          "dimension_flag = #{dimensionFlag,jdbcType=TINYINT},",
          "sms_template_id = #{smsTemplateId,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(InstCollectionRule record);
}