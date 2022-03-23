package com.puhui.bean.outsourcing;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
  * @ClassName OutsourceRequestInfoResult
  * @Description 委外放款件结果表
  * @Author JiaZhang
  * @Date 2019/1/8 6:50 PM
  * @Version 1.0
**/
@Data
public class OutsourceRequestInfoResult {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;
    /**
     * 核心进件号
     */
    @TableField("core_lend_request_id")
    private Long coreLendRequestId;
    /**
     * 剩余未还本金
     */
    @TableField("unrepay_principal")
    private BigDecimal unrepayPrincipal;
    /**
     * 一次性结清金额
     */
    @TableField("square_up_amount")
    private BigDecimal squareUpAmount;
    /**
     * 所属账单日
     */
    @TableField("this_due_date")
    private Date thisDueDate;
    /**
     * 期数
     */
    @TableField("this_phase")
    private Integer thisPhase;
    /**
     * 分区字段
     */
    @TableField("dt")
    private Date dt;
}