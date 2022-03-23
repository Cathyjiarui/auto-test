package com.puhui.mapper.outsourcing;

import com.puhui.bean.outsourcing.OutsourcingBatchNormRelation;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface OutsourcingBatchNormRelationMapper {
    @Delete({
        "delete from outsourcing_batch_norm_relation",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into outsourcing_batch_norm_relation (id, create_time, ",
        "update_time, out_batch_id, ",
        "out_norm_id, org_id, ",
        "extract_value)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{outBatchId,jdbcType=BIGINT}, ",
        "#{outNormId,jdbcType=BIGINT}, #{orgId,jdbcType=BIGINT}, ",
        "#{extractValue,jdbcType=DECIMAL})"
    })
    int insert(OutsourcingBatchNormRelation record);

    @Select({
        "select",
        "id, create_time, update_time, out_batch_id, out_norm_id, org_id, extract_value",
        "from outsourcing_batch_norm_relation",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="out_batch_id", property="outBatchId", jdbcType=JdbcType.BIGINT),
        @Result(column="out_norm_id", property="outNormId", jdbcType=JdbcType.BIGINT),
        @Result(column="org_id", property="orgId", jdbcType=JdbcType.BIGINT),
        @Result(column="extract_value", property="extractValue", jdbcType=JdbcType.DECIMAL)
    })
    OutsourcingBatchNormRelation selectByPrimaryKey(Long id);

    @Update({
        "update outsourcing_batch_norm_relation",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "out_batch_id = #{outBatchId,jdbcType=BIGINT},",
          "out_norm_id = #{outNormId,jdbcType=BIGINT},",
          "org_id = #{orgId,jdbcType=BIGINT},",
          "extract_value = #{extractValue,jdbcType=DECIMAL}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OutsourcingBatchNormRelation record);
}