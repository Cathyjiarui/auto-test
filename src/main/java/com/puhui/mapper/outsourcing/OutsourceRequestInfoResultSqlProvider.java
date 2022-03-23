package com.puhui.mapper.outsourcing;

import com.puhui.bean.outsourcing.OutsourceRequestInfoResult;
import org.apache.ibatis.jdbc.SQL;

public class OutsourceRequestInfoResultSqlProvider {

    public String insertSelective(OutsourceRequestInfoResult record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("outsource_request_info_result");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCoreLendRequestId() != null) {
            sql.VALUES("core_lend_request_id", "#{coreLendRequestId,jdbcType=BIGINT}");
        }
        
        if (record.getUnrepayPrincipal() != null) {
            sql.VALUES("unrepay_principal", "#{unrepayPrincipal,jdbcType=DECIMAL}");
        }
        
        if (record.getSquareUpAmount() != null) {
            sql.VALUES("square_up_amount", "#{squareUpAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getThisDueDate() != null) {
            sql.VALUES("this_due_date", "#{thisDueDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getThisPhase() != null) {
            sql.VALUES("this_phase", "#{thisPhase,jdbcType=INTEGER}");
        }
        
        if (record.getDt() != null) {
            sql.VALUES("dt", "#{dt,jdbcType=DATE}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(OutsourceRequestInfoResult record) {
        SQL sql = new SQL();
        sql.UPDATE("outsource_request_info_result");
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCoreLendRequestId() != null) {
            sql.SET("core_lend_request_id = #{coreLendRequestId,jdbcType=BIGINT}");
        }
        
        if (record.getUnrepayPrincipal() != null) {
            sql.SET("unrepay_principal = #{unrepayPrincipal,jdbcType=DECIMAL}");
        }
        
        if (record.getSquareUpAmount() != null) {
            sql.SET("square_up_amount = #{squareUpAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getThisDueDate() != null) {
            sql.SET("this_due_date = #{thisDueDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getThisPhase() != null) {
            sql.SET("this_phase = #{thisPhase,jdbcType=INTEGER}");
        }
        
        if (record.getDt() != null) {
            sql.SET("dt = #{dt,jdbcType=DATE}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}