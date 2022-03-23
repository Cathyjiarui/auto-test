package com.puhui.mapper.outsourcing;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.puhui.bean.outsourcing.OutsourcingKase;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface OutsourcingKaseMapper extends BaseMapper<OutsourcingKase> {
    //@Delete({
    //    "delete from outsourcing_kase",
    //    "where id = #{id,jdbcType=BIGINT}"
    //})
    //int deleteByPrimaryKey(Long id);
    //
    //@Insert({
    //    "insert into outsourcing_kase (id, create_time, ",
    //    "update_time, inflow_time, ",
    //    "status, request_id, ",
    //    "asset_request_id, kase_package_id, ",
    //    "kase_id, client_id, ",
    //    "customer_id, customer_name, ",
    //    "contract_code, customer_phone, ",
    //    "customer_id_no, pass_time, ",
    //    "bill_date, channel_id, ",
    //    "store_id, store_name, ",
    //    "scan_flag)",
    //    "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
    //    "#{updateTime,jdbcType=TIMESTAMP}, #{inflowTime,jdbcType=TIMESTAMP}, ",
    //    "#{status,jdbcType=INTEGER}, #{requestId,jdbcType=BIGINT}, ",
    //    "#{assetRequestId,jdbcType=BIGINT}, #{kasePackageId,jdbcType=BIGINT}, ",
    //    "#{kaseId,jdbcType=BIGINT}, #{clientId,jdbcType=BIGINT}, ",
    //    "#{customerId,jdbcType=BIGINT}, #{customerName,jdbcType=VARCHAR}, ",
    //    "#{contractCode,jdbcType=VARCHAR}, #{customerPhone,jdbcType=VARCHAR}, ",
    //    "#{customerIdNo,jdbcType=VARCHAR}, #{passTime,jdbcType=TIMESTAMP}, ",
    //    "#{billDate,jdbcType=INTEGER}, #{channelId,jdbcType=BIGINT}, ",
    //    "#{storeId,jdbcType=BIGINT}, #{storeName,jdbcType=VARCHAR}, ",
    //    "#{scanFlag,jdbcType=TINYINT})"
    //})
    //int insert(OutsourcingKase record);
    //
    //@Select({
    //    "select",
    //    "id, create_time, update_time, inflow_time, status, request_id, asset_request_id, ",
    //    "kase_package_id, kase_id, client_id, customer_id, customer_name, contract_code, ",
    //    "customer_phone, customer_id_no, pass_time, bill_date, channel_id, store_id, ",
    //    "store_name, scan_flag",
    //    "from outsourcing_kase",
    //    "where id = #{id,jdbcType=BIGINT}"
    //})
    //@Results({
    //    @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
    //    @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
    //    @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
    //    @Result(column="inflow_time", property="inflowTime", jdbcType=JdbcType.TIMESTAMP),
    //    @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
    //    @Result(column="request_id", property="requestId", jdbcType=JdbcType.BIGINT),
    //    @Result(column="asset_request_id", property="assetRequestId", jdbcType=JdbcType.BIGINT),
    //    @Result(column="kase_package_id", property="kasePackageId", jdbcType=JdbcType.BIGINT),
    //    @Result(column="kase_id", property="kaseId", jdbcType=JdbcType.BIGINT),
    //    @Result(column="client_id", property="clientId", jdbcType=JdbcType.BIGINT),
    //    @Result(column="customer_id", property="customerId", jdbcType=JdbcType.BIGINT),
    //    @Result(column="customer_name", property="customerName", jdbcType=JdbcType.VARCHAR),
    //    @Result(column="contract_code", property="contractCode", jdbcType=JdbcType.VARCHAR),
    //    @Result(column="customer_phone", property="customerPhone", jdbcType=JdbcType.VARCHAR),
    //    @Result(column="customer_id_no", property="customerIdNo", jdbcType=JdbcType.VARCHAR),
    //    @Result(column="pass_time", property="passTime", jdbcType=JdbcType.TIMESTAMP),
    //    @Result(column="bill_date", property="billDate", jdbcType=JdbcType.INTEGER),
    //    @Result(column="channel_id", property="channelId", jdbcType=JdbcType.BIGINT),
    //    @Result(column="store_id", property="storeId", jdbcType=JdbcType.BIGINT),
    //    @Result(column="store_name", property="storeName", jdbcType=JdbcType.VARCHAR),
    //    @Result(column="scan_flag", property="scanFlag", jdbcType=JdbcType.TINYINT)
    //})
    //OutsourcingKase selectByPrimaryKey(Long id);
    //
    //@Update({
    //    "update outsourcing_kase",
    //    "set create_time = #{createTime,jdbcType=TIMESTAMP},",
    //      "update_time = #{updateTime,jdbcType=TIMESTAMP},",
    //      "inflow_time = #{inflowTime,jdbcType=TIMESTAMP},",
    //      "status = #{status,jdbcType=INTEGER},",
    //      "request_id = #{requestId,jdbcType=BIGINT},",
    //      "asset_request_id = #{assetRequestId,jdbcType=BIGINT},",
    //      "kase_package_id = #{kasePackageId,jdbcType=BIGINT},",
    //      "kase_id = #{kaseId,jdbcType=BIGINT},",
    //      "client_id = #{clientId,jdbcType=BIGINT},",
    //      "customer_id = #{customerId,jdbcType=BIGINT},",
    //      "customer_name = #{customerName,jdbcType=VARCHAR},",
    //      "contract_code = #{contractCode,jdbcType=VARCHAR},",
    //      "customer_phone = #{customerPhone,jdbcType=VARCHAR},",
    //      "customer_id_no = #{customerIdNo,jdbcType=VARCHAR},",
    //      "pass_time = #{passTime,jdbcType=TIMESTAMP},",
    //      "bill_date = #{billDate,jdbcType=INTEGER},",
    //      "channel_id = #{channelId,jdbcType=BIGINT},",
    //      "store_id = #{storeId,jdbcType=BIGINT},",
    //      "store_name = #{storeName,jdbcType=VARCHAR},",
    //      "scan_flag = #{scanFlag,jdbcType=TINYINT}",
    //    "where id = #{id,jdbcType=BIGINT}"
    //})
    //int updateByPrimaryKey(OutsourcingKase record);
}