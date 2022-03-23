package com.puhui.mapper.inst;

import com.puhui.bean.inst.InstRuleRcgRelation;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface InstRuleRcgRelationMapper {
    @Delete({
        "delete from inst_rule_rcg_relation",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into inst_rule_rcg_relation (id, create_time, ",
        "update_time, inst_collection_rule_id, ",
        "repay_customer_group_id, expire_days, ",
        "valid)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{instCollectionRuleId,jdbcType=BIGINT}, ",
        "#{repayCustomerGroupId,jdbcType=BIGINT}, #{expireDays,jdbcType=INTEGER}, ",
        "#{valid,jdbcType=BIT})"
    })
    int insert(InstRuleRcgRelation record);

    @Select({
        "select",
        "id, create_time, update_time, inst_collection_rule_id, repay_customer_group_id, ",
        "expire_days, valid",
        "from inst_rule_rcg_relation",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="inst_collection_rule_id", property="instCollectionRuleId", jdbcType=JdbcType.BIGINT),
        @Result(column="repay_customer_group_id", property="repayCustomerGroupId", jdbcType=JdbcType.BIGINT),
        @Result(column="expire_days", property="expireDays", jdbcType=JdbcType.INTEGER),
        @Result(column="valid", property="valid", jdbcType=JdbcType.BIT)
    })
    InstRuleRcgRelation selectByPrimaryKey(Long id);

    @Update({
        "update inst_rule_rcg_relation",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "inst_collection_rule_id = #{instCollectionRuleId,jdbcType=BIGINT},",
          "repay_customer_group_id = #{repayCustomerGroupId,jdbcType=BIGINT},",
          "expire_days = #{expireDays,jdbcType=INTEGER},",
          "valid = #{valid,jdbcType=BIT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(InstRuleRcgRelation record);
}