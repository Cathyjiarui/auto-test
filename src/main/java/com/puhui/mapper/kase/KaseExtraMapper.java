package com.puhui.mapper.kase;

import com.puhui.bean.kase.KaseExtra;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface KaseExtraMapper {
    @Delete({
        "delete from kase_extra",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into kase_extra (id, create_time, ",
        "update_time, kase_contract_id, ",
        "deposit, extension_flag, ",
        "payment_body, shop_name, ",
        "goods_name, customer_pay_day, ",
        "order_no, business_transaction_id, ",
        "specified_group, sales_dimission)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{kaseContractId,jdbcType=BIGINT}, ",
        "#{deposit,jdbcType=BIT}, #{extensionFlag,jdbcType=TINYINT}, ",
        "#{paymentBody,jdbcType=VARCHAR}, #{shopName,jdbcType=VARCHAR}, ",
        "#{goodsName,jdbcType=VARCHAR}, #{customerPayDay,jdbcType=TIMESTAMP}, ",
        "#{orderNo,jdbcType=VARCHAR}, #{businessTransactionId,jdbcType=VARCHAR}, ",
        "#{specifiedGroup,jdbcType=VARCHAR}, #{salesDimission,jdbcType=BIT})"
    })
    int insert(KaseExtra record);

    @Select({
        "select",
        "id, create_time, update_time, kase_contract_id, deposit, extension_flag, payment_body, ",
        "shop_name, goods_name, customer_pay_day, order_no, business_transaction_id, ",
        "specified_group, sales_dimission",
        "from kase_extra",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="kase_contract_id", property="kaseContractId", jdbcType=JdbcType.BIGINT),
        @Result(column="deposit", property="deposit", jdbcType=JdbcType.BIT),
        @Result(column="extension_flag", property="extensionFlag", jdbcType=JdbcType.TINYINT),
        @Result(column="payment_body", property="paymentBody", jdbcType=JdbcType.VARCHAR),
        @Result(column="shop_name", property="shopName", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_name", property="goodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="customer_pay_day", property="customerPayDay", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="order_no", property="orderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="business_transaction_id", property="businessTransactionId", jdbcType=JdbcType.VARCHAR),
        @Result(column="specified_group", property="specifiedGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="sales_dimission", property="salesDimission", jdbcType=JdbcType.BIT)
    })
    KaseExtra selectByPrimaryKey(Long id);

    @Update({
        "update kase_extra",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "kase_contract_id = #{kaseContractId,jdbcType=BIGINT},",
          "deposit = #{deposit,jdbcType=BIT},",
          "extension_flag = #{extensionFlag,jdbcType=TINYINT},",
          "payment_body = #{paymentBody,jdbcType=VARCHAR},",
          "shop_name = #{shopName,jdbcType=VARCHAR},",
          "goods_name = #{goodsName,jdbcType=VARCHAR},",
          "customer_pay_day = #{customerPayDay,jdbcType=TIMESTAMP},",
          "order_no = #{orderNo,jdbcType=VARCHAR},",
          "business_transaction_id = #{businessTransactionId,jdbcType=VARCHAR},",
          "specified_group = #{specifiedGroup,jdbcType=VARCHAR},",
          "sales_dimission = #{salesDimission,jdbcType=BIT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(KaseExtra record);
}