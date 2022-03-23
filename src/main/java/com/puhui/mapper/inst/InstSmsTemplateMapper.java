package com.puhui.mapper.inst;

import com.puhui.bean.inst.InstSmsTemplate;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface InstSmsTemplateMapper {
    @Delete({
        "delete from inst_sms_template",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into inst_sms_template (id, create_time, ",
        "update_time, template_name, ",
        "template_content, valid, ",
        "remark)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{templateName,jdbcType=VARCHAR}, ",
        "#{templateContent,jdbcType=VARCHAR}, #{valid,jdbcType=BIT}, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(InstSmsTemplate record);

    @Select({
        "select",
        "id, create_time, update_time, template_name, template_content, valid, remark",
        "from inst_sms_template",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="template_name", property="templateName", jdbcType=JdbcType.VARCHAR),
        @Result(column="template_content", property="templateContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="valid", property="valid", jdbcType=JdbcType.BIT),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    InstSmsTemplate selectByPrimaryKey(Long id);

    @Update({
        "update inst_sms_template",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "template_name = #{templateName,jdbcType=VARCHAR},",
          "template_content = #{templateContent,jdbcType=VARCHAR},",
          "valid = #{valid,jdbcType=BIT},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(InstSmsTemplate record);
}