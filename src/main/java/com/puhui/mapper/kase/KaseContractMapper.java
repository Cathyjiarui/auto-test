package com.puhui.mapper.kase;

import com.puhui.bean.kase.KaseContract;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface KaseContractMapper {
    @Delete({
        "delete from kase_contract",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into kase_contract (id, create_time, ",
        "update_time, request_id, ",
        "asset_request_id, customer_account_id, ",
        "lob_id, channel_id, ",
        "contract_no, loan_amount, ",
        "loan_date, loan_purpose, ",
        "loan_period, contracted_amount, ",
        "contract_date, bill_date, ",
        "monthly_total_rate, product_name, ",
        "settle_status, salespeople, ",
        "seller, seller_name, ",
        "submiter, submiter_name, ",
        "sell_group, sell_group_name, ",
        "store_city, store_id, ",
        "store_name, store_province, ",
        "big_data_no)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{requestId,jdbcType=BIGINT}, ",
        "#{assetRequestId,jdbcType=BIGINT}, #{customerAccountId,jdbcType=BIGINT}, ",
        "#{lobId,jdbcType=BIGINT}, #{channelId,jdbcType=BIGINT}, ",
        "#{contractNo,jdbcType=VARCHAR}, #{loanAmount,jdbcType=DECIMAL}, ",
        "#{loanDate,jdbcType=TIMESTAMP}, #{loanPurpose,jdbcType=VARCHAR}, ",
        "#{loanPeriod,jdbcType=INTEGER}, #{contractedAmount,jdbcType=DECIMAL}, ",
        "#{contractDate,jdbcType=TIMESTAMP}, #{billDate,jdbcType=INTEGER}, ",
        "#{monthlyTotalRate,jdbcType=DECIMAL}, #{productName,jdbcType=VARCHAR}, ",
        "#{settleStatus,jdbcType=BIT}, #{salespeople,jdbcType=VARCHAR}, ",
        "#{seller,jdbcType=BIGINT}, #{sellerName,jdbcType=VARCHAR}, ",
        "#{submiter,jdbcType=BIGINT}, #{submiterName,jdbcType=VARCHAR}, ",
        "#{sellGroup,jdbcType=BIGINT}, #{sellGroupName,jdbcType=VARCHAR}, ",
        "#{storeCity,jdbcType=VARCHAR}, #{storeId,jdbcType=BIGINT}, ",
        "#{storeName,jdbcType=VARCHAR}, #{storeProvince,jdbcType=VARCHAR}, ",
        "#{bigDataNo,jdbcType=VARCHAR})"
    })
    int insert(KaseContract record);

    @Select({
        "select",
        "id, create_time, update_time, request_id, asset_request_id, customer_account_id, ",
        "lob_id, channel_id, contract_no, loan_amount, loan_date, loan_purpose, loan_period, ",
        "contracted_amount, contract_date, bill_date, monthly_total_rate, product_name, ",
        "settle_status, salespeople, seller, seller_name, submiter, submiter_name, sell_group, ",
        "sell_group_name, store_city, store_id, store_name, store_province, big_data_no",
        "from kase_contract",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="request_id", property="requestId", jdbcType=JdbcType.BIGINT),
        @Result(column="asset_request_id", property="assetRequestId", jdbcType=JdbcType.BIGINT),
        @Result(column="customer_account_id", property="customerAccountId", jdbcType=JdbcType.BIGINT),
        @Result(column="lob_id", property="lobId", jdbcType=JdbcType.BIGINT),
        @Result(column="channel_id", property="channelId", jdbcType=JdbcType.BIGINT),
        @Result(column="contract_no", property="contractNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="loan_amount", property="loanAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="loan_date", property="loanDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="loan_purpose", property="loanPurpose", jdbcType=JdbcType.VARCHAR),
        @Result(column="loan_period", property="loanPeriod", jdbcType=JdbcType.INTEGER),
        @Result(column="contracted_amount", property="contractedAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="contract_date", property="contractDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="bill_date", property="billDate", jdbcType=JdbcType.INTEGER),
        @Result(column="monthly_total_rate", property="monthlyTotalRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="product_name", property="productName", jdbcType=JdbcType.VARCHAR),
        @Result(column="settle_status", property="settleStatus", jdbcType=JdbcType.BIT),
        @Result(column="salespeople", property="salespeople", jdbcType=JdbcType.VARCHAR),
        @Result(column="seller", property="seller", jdbcType=JdbcType.BIGINT),
        @Result(column="seller_name", property="sellerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="submiter", property="submiter", jdbcType=JdbcType.BIGINT),
        @Result(column="submiter_name", property="submiterName", jdbcType=JdbcType.VARCHAR),
        @Result(column="sell_group", property="sellGroup", jdbcType=JdbcType.BIGINT),
        @Result(column="sell_group_name", property="sellGroupName", jdbcType=JdbcType.VARCHAR),
        @Result(column="store_city", property="storeCity", jdbcType=JdbcType.VARCHAR),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.BIGINT),
        @Result(column="store_name", property="storeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="store_province", property="storeProvince", jdbcType=JdbcType.VARCHAR),
        @Result(column="big_data_no", property="bigDataNo", jdbcType=JdbcType.VARCHAR)
    })
    KaseContract selectByPrimaryKey(Long id);

    @Update({
        "update kase_contract",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "request_id = #{requestId,jdbcType=BIGINT},",
          "asset_request_id = #{assetRequestId,jdbcType=BIGINT},",
          "customer_account_id = #{customerAccountId,jdbcType=BIGINT},",
          "lob_id = #{lobId,jdbcType=BIGINT},",
          "channel_id = #{channelId,jdbcType=BIGINT},",
          "contract_no = #{contractNo,jdbcType=VARCHAR},",
          "loan_amount = #{loanAmount,jdbcType=DECIMAL},",
          "loan_date = #{loanDate,jdbcType=TIMESTAMP},",
          "loan_purpose = #{loanPurpose,jdbcType=VARCHAR},",
          "loan_period = #{loanPeriod,jdbcType=INTEGER},",
          "contracted_amount = #{contractedAmount,jdbcType=DECIMAL},",
          "contract_date = #{contractDate,jdbcType=TIMESTAMP},",
          "bill_date = #{billDate,jdbcType=INTEGER},",
          "monthly_total_rate = #{monthlyTotalRate,jdbcType=DECIMAL},",
          "product_name = #{productName,jdbcType=VARCHAR},",
          "settle_status = #{settleStatus,jdbcType=BIT},",
          "salespeople = #{salespeople,jdbcType=VARCHAR},",
          "seller = #{seller,jdbcType=BIGINT},",
          "seller_name = #{sellerName,jdbcType=VARCHAR},",
          "submiter = #{submiter,jdbcType=BIGINT},",
          "submiter_name = #{submiterName,jdbcType=VARCHAR},",
          "sell_group = #{sellGroup,jdbcType=BIGINT},",
          "sell_group_name = #{sellGroupName,jdbcType=VARCHAR},",
          "store_city = #{storeCity,jdbcType=VARCHAR},",
          "store_id = #{storeId,jdbcType=BIGINT},",
          "store_name = #{storeName,jdbcType=VARCHAR},",
          "store_province = #{storeProvince,jdbcType=VARCHAR},",
          "big_data_no = #{bigDataNo,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(KaseContract record);
}