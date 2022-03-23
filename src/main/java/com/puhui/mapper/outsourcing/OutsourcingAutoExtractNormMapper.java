package com.puhui.mapper.outsourcing;

import com.puhui.bean.outsourcing.OutsourcingAutoExtractNorm;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface OutsourcingAutoExtractNormMapper {
    @Delete({
        "delete from outsourcing_auto_extract_norm",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into outsourcing_auto_extract_norm (id, create_time, ",
        "update_time, out_org_id, ",
        "norm_name, norm_priority, ",
        "client_id, extract_condition, ",
        "extract_model, extract_type, ",
        "extract_value, remark)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{outOrgId,jdbcType=BIGINT}, ",
        "#{normName,jdbcType=VARCHAR}, #{normPriority,jdbcType=INTEGER}, ",
        "#{clientId,jdbcType=BIGINT}, #{extractCondition,jdbcType=VARCHAR}, ",
        "#{extractModel,jdbcType=VARCHAR}, #{extractType,jdbcType=INTEGER}, ",
        "#{extractValue,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR})"
    })
    int insert(OutsourcingAutoExtractNorm record);

    @Select({
        "select",
        "id, create_time, update_time, out_org_id, norm_name, norm_priority, client_id, ",
        "extract_condition, extract_model, extract_type, extract_value, remark",
        "from outsourcing_auto_extract_norm",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="out_org_id", property="outOrgId", jdbcType=JdbcType.BIGINT),
        @Result(column="norm_name", property="normName", jdbcType=JdbcType.VARCHAR),
        @Result(column="norm_priority", property="normPriority", jdbcType=JdbcType.INTEGER),
        @Result(column="client_id", property="clientId", jdbcType=JdbcType.BIGINT),
        @Result(column="extract_condition", property="extractCondition", jdbcType=JdbcType.VARCHAR),
        @Result(column="extract_model", property="extractModel", jdbcType=JdbcType.VARCHAR),
        @Result(column="extract_type", property="extractType", jdbcType=JdbcType.INTEGER),
        @Result(column="extract_value", property="extractValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    OutsourcingAutoExtractNorm selectByPrimaryKey(Long id);

    @Update({
        "update outsourcing_auto_extract_norm",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "out_org_id = #{outOrgId,jdbcType=BIGINT},",
          "norm_name = #{normName,jdbcType=VARCHAR},",
          "norm_priority = #{normPriority,jdbcType=INTEGER},",
          "client_id = #{clientId,jdbcType=BIGINT},",
          "extract_condition = #{extractCondition,jdbcType=VARCHAR},",
          "extract_model = #{extractModel,jdbcType=VARCHAR},",
          "extract_type = #{extractType,jdbcType=INTEGER},",
          "extract_value = #{extractValue,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OutsourcingAutoExtractNorm record);
}