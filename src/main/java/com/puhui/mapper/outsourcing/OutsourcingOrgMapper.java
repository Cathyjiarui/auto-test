package com.puhui.mapper.outsourcing;

import com.puhui.bean.outsourcing.OutsourcingOrg;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface OutsourcingOrgMapper {
    @Delete({
        "delete from outsourcing_org",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into outsourcing_org (id, create_time, ",
        "update_time, org_name, ",
        "org_code, contacts, ",
        "email, mobile, contract_date, ",
        "cancellation_date, send_mode, ",
        "valid)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{orgName,jdbcType=VARCHAR}, ",
        "#{orgCode,jdbcType=VARCHAR}, #{contacts,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{mobile,jdbcType=VARCHAR}, #{contractDate,jdbcType=TIMESTAMP}, ",
        "#{cancellationDate,jdbcType=TIMESTAMP}, #{sendMode,jdbcType=TINYINT}, ",
        "#{valid,jdbcType=TINYINT})"
    })
    int insert(OutsourcingOrg record);

    @Select({
        "select",
        "id, create_time, update_time, org_name, org_code, contacts, email, mobile, contract_date, ",
        "cancellation_date, send_mode, valid",
        "from outsourcing_org",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="org_name", property="orgName", jdbcType=JdbcType.VARCHAR),
        @Result(column="org_code", property="orgCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="contacts", property="contacts", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="contract_date", property="contractDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="cancellation_date", property="cancellationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="send_mode", property="sendMode", jdbcType=JdbcType.TINYINT),
        @Result(column="valid", property="valid", jdbcType=JdbcType.TINYINT)
    })
    OutsourcingOrg selectByPrimaryKey(Long id);

    @Update({
        "update outsourcing_org",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "org_name = #{orgName,jdbcType=VARCHAR},",
          "org_code = #{orgCode,jdbcType=VARCHAR},",
          "contacts = #{contacts,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "contract_date = #{contractDate,jdbcType=TIMESTAMP},",
          "cancellation_date = #{cancellationDate,jdbcType=TIMESTAMP},",
          "send_mode = #{sendMode,jdbcType=TINYINT},",
          "valid = #{valid,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OutsourcingOrg record);
}