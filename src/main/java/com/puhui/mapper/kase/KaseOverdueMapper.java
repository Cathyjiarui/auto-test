package com.puhui.mapper.kase;

import com.puhui.bean.kase.KaseOverdue;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface KaseOverdueMapper {
    @Delete({
        "delete from kase_overdue",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into kase_overdue (id, create_time, ",
        "update_time, this_cycle, ",
        "loan_channel_type, last_repay_date, ",
        "inflow_time, outflow_time, ",
        "customer_account_id, lob_id, ",
        "channel_id, kase_contract_id, ",
        "kase_package_id, request_id, ",
        "asset_request_id, init_overdue_period, ",
        "current_overdue_period, overdue_days, ",
        "lend_phase, init_overdue_total, ",
        "current_overdue_total, init_surplus_principal, ",
        "current_surplus_principal, loan_principal, ",
        "loan_interest, monthly_repay, ",
        "cm, new_case, closed)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{thisCycle,jdbcType=DATE}, ",
        "#{loanChannelType,jdbcType=VARCHAR}, #{lastRepayDate,jdbcType=TIMESTAMP}, ",
        "#{inflowTime,jdbcType=TIMESTAMP}, #{outflowTime,jdbcType=TIMESTAMP}, ",
        "#{customerAccountId,jdbcType=BIGINT}, #{lobId,jdbcType=BIGINT}, ",
        "#{channelId,jdbcType=BIGINT}, #{kaseContractId,jdbcType=BIGINT}, ",
        "#{kasePackageId,jdbcType=BIGINT}, #{requestId,jdbcType=BIGINT}, ",
        "#{assetRequestId,jdbcType=BIGINT}, #{initOverduePeriod,jdbcType=INTEGER}, ",
        "#{currentOverduePeriod,jdbcType=INTEGER}, #{overdueDays,jdbcType=INTEGER}, ",
        "#{lendPhase,jdbcType=INTEGER}, #{initOverdueTotal,jdbcType=DECIMAL}, ",
        "#{currentOverdueTotal,jdbcType=DECIMAL}, #{initSurplusPrincipal,jdbcType=DECIMAL}, ",
        "#{currentSurplusPrincipal,jdbcType=DECIMAL}, #{loanPrincipal,jdbcType=DECIMAL}, ",
        "#{loanInterest,jdbcType=DECIMAL}, #{monthlyRepay,jdbcType=DECIMAL}, ",
        "#{cm,jdbcType=BIT}, #{newCase,jdbcType=BIT}, #{closed,jdbcType=BIT})"
    })
    int insert(KaseOverdue record);

    @Select({
        "select",
        "id, create_time, update_time, this_cycle, loan_channel_type, last_repay_date, ",
        "inflow_time, outflow_time, customer_account_id, lob_id, channel_id, kase_contract_id, ",
        "kase_package_id, request_id, asset_request_id, init_overdue_period, current_overdue_period, ",
        "overdue_days, lend_phase, init_overdue_total, current_overdue_total, init_surplus_principal, ",
        "current_surplus_principal, loan_principal, loan_interest, monthly_repay, cm, ",
        "new_case, closed",
        "from kase_overdue",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="this_cycle", property="thisCycle", jdbcType=JdbcType.DATE),
        @Result(column="loan_channel_type", property="loanChannelType", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_repay_date", property="lastRepayDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="inflow_time", property="inflowTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="outflow_time", property="outflowTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="customer_account_id", property="customerAccountId", jdbcType=JdbcType.BIGINT),
        @Result(column="lob_id", property="lobId", jdbcType=JdbcType.BIGINT),
        @Result(column="channel_id", property="channelId", jdbcType=JdbcType.BIGINT),
        @Result(column="kase_contract_id", property="kaseContractId", jdbcType=JdbcType.BIGINT),
        @Result(column="kase_package_id", property="kasePackageId", jdbcType=JdbcType.BIGINT),
        @Result(column="request_id", property="requestId", jdbcType=JdbcType.BIGINT),
        @Result(column="asset_request_id", property="assetRequestId", jdbcType=JdbcType.BIGINT),
        @Result(column="init_overdue_period", property="initOverduePeriod", jdbcType=JdbcType.INTEGER),
        @Result(column="current_overdue_period", property="currentOverduePeriod", jdbcType=JdbcType.INTEGER),
        @Result(column="overdue_days", property="overdueDays", jdbcType=JdbcType.INTEGER),
        @Result(column="lend_phase", property="lendPhase", jdbcType=JdbcType.INTEGER),
        @Result(column="init_overdue_total", property="initOverdueTotal", jdbcType=JdbcType.DECIMAL),
        @Result(column="current_overdue_total", property="currentOverdueTotal", jdbcType=JdbcType.DECIMAL),
        @Result(column="init_surplus_principal", property="initSurplusPrincipal", jdbcType=JdbcType.DECIMAL),
        @Result(column="current_surplus_principal", property="currentSurplusPrincipal", jdbcType=JdbcType.DECIMAL),
        @Result(column="loan_principal", property="loanPrincipal", jdbcType=JdbcType.DECIMAL),
        @Result(column="loan_interest", property="loanInterest", jdbcType=JdbcType.DECIMAL),
        @Result(column="monthly_repay", property="monthlyRepay", jdbcType=JdbcType.DECIMAL),
        @Result(column="cm", property="cm", jdbcType=JdbcType.BIT),
        @Result(column="new_case", property="newCase", jdbcType=JdbcType.BIT),
        @Result(column="closed", property="closed", jdbcType=JdbcType.BIT)
    })
    KaseOverdue selectByPrimaryKey(Long id);

    @Update({
        "update kase_overdue",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "this_cycle = #{thisCycle,jdbcType=DATE},",
          "loan_channel_type = #{loanChannelType,jdbcType=VARCHAR},",
          "last_repay_date = #{lastRepayDate,jdbcType=TIMESTAMP},",
          "inflow_time = #{inflowTime,jdbcType=TIMESTAMP},",
          "outflow_time = #{outflowTime,jdbcType=TIMESTAMP},",
          "customer_account_id = #{customerAccountId,jdbcType=BIGINT},",
          "lob_id = #{lobId,jdbcType=BIGINT},",
          "channel_id = #{channelId,jdbcType=BIGINT},",
          "kase_contract_id = #{kaseContractId,jdbcType=BIGINT},",
          "kase_package_id = #{kasePackageId,jdbcType=BIGINT},",
          "request_id = #{requestId,jdbcType=BIGINT},",
          "asset_request_id = #{assetRequestId,jdbcType=BIGINT},",
          "init_overdue_period = #{initOverduePeriod,jdbcType=INTEGER},",
          "current_overdue_period = #{currentOverduePeriod,jdbcType=INTEGER},",
          "overdue_days = #{overdueDays,jdbcType=INTEGER},",
          "lend_phase = #{lendPhase,jdbcType=INTEGER},",
          "init_overdue_total = #{initOverdueTotal,jdbcType=DECIMAL},",
          "current_overdue_total = #{currentOverdueTotal,jdbcType=DECIMAL},",
          "init_surplus_principal = #{initSurplusPrincipal,jdbcType=DECIMAL},",
          "current_surplus_principal = #{currentSurplusPrincipal,jdbcType=DECIMAL},",
          "loan_principal = #{loanPrincipal,jdbcType=DECIMAL},",
          "loan_interest = #{loanInterest,jdbcType=DECIMAL},",
          "monthly_repay = #{monthlyRepay,jdbcType=DECIMAL},",
          "cm = #{cm,jdbcType=BIT},",
          "new_case = #{newCase,jdbcType=BIT},",
          "closed = #{closed,jdbcType=BIT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(KaseOverdue record);
}