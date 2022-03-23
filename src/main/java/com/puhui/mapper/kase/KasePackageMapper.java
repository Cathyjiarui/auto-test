package com.puhui.mapper.kase;

import com.puhui.bean.kase.KasePackage;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface KasePackageMapper {
    @Delete({
        "delete from kase_package",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into kase_package (id, create_time, ",
        "update_time, identifier, ",
        "customer_id, current_collector_id, ",
        "inflow_time, closure_time, ",
        "overdue_level, overdue_days, ",
        "surplus_principal, latest_append_time, ",
        "latest_rollback_time, closed, ",
        "closed_time, assigned)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{identifier,jdbcType=VARCHAR}, ",
        "#{customerId,jdbcType=BIGINT}, #{currentCollectorId,jdbcType=BIGINT}, ",
        "#{inflowTime,jdbcType=TIMESTAMP}, #{closureTime,jdbcType=TIMESTAMP}, ",
        "#{overdueLevel,jdbcType=INTEGER}, #{overdueDays,jdbcType=INTEGER}, ",
        "#{surplusPrincipal,jdbcType=DECIMAL}, #{latestAppendTime,jdbcType=TIMESTAMP}, ",
        "#{latestRollbackTime,jdbcType=TIMESTAMP}, #{closed,jdbcType=BIT}, ",
        "#{closedTime,jdbcType=TIMESTAMP}, #{assigned,jdbcType=BIT})"
    })
    int insert(KasePackage record);

    @Select({
        "select",
        "id, create_time, update_time, identifier, customer_id, current_collector_id, ",
        "inflow_time, closure_time, overdue_level, overdue_days, surplus_principal, latest_append_time, ",
        "latest_rollback_time, closed, closed_time, assigned",
        "from kase_package",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="identifier", property="identifier", jdbcType=JdbcType.VARCHAR),
        @Result(column="customer_id", property="customerId", jdbcType=JdbcType.BIGINT),
        @Result(column="current_collector_id", property="currentCollectorId", jdbcType=JdbcType.BIGINT),
        @Result(column="inflow_time", property="inflowTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="closure_time", property="closureTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="overdue_level", property="overdueLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="overdue_days", property="overdueDays", jdbcType=JdbcType.INTEGER),
        @Result(column="surplus_principal", property="surplusPrincipal", jdbcType=JdbcType.DECIMAL),
        @Result(column="latest_append_time", property="latestAppendTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="latest_rollback_time", property="latestRollbackTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="closed", property="closed", jdbcType=JdbcType.BIT),
        @Result(column="closed_time", property="closedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="assigned", property="assigned", jdbcType=JdbcType.BIT)
    })
    KasePackage selectByPrimaryKey(Long id);

    @Update({
        "update kase_package",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "identifier = #{identifier,jdbcType=VARCHAR},",
          "customer_id = #{customerId,jdbcType=BIGINT},",
          "current_collector_id = #{currentCollectorId,jdbcType=BIGINT},",
          "inflow_time = #{inflowTime,jdbcType=TIMESTAMP},",
          "closure_time = #{closureTime,jdbcType=TIMESTAMP},",
          "overdue_level = #{overdueLevel,jdbcType=INTEGER},",
          "overdue_days = #{overdueDays,jdbcType=INTEGER},",
          "surplus_principal = #{surplusPrincipal,jdbcType=DECIMAL},",
          "latest_append_time = #{latestAppendTime,jdbcType=TIMESTAMP},",
          "latest_rollback_time = #{latestRollbackTime,jdbcType=TIMESTAMP},",
          "closed = #{closed,jdbcType=BIT},",
          "closed_time = #{closedTime,jdbcType=TIMESTAMP},",
          "assigned = #{assigned,jdbcType=BIT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(KasePackage record);
}