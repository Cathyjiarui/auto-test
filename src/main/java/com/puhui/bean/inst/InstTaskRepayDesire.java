package com.puhui.bean.inst;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
  * @ClassName InstTaskRepayDesire
  * @Description 任务对应的还款意愿
  * @Author JiaZhang
  * @Date 2018/12/29 5:00 PM
  * @Version 1.0
**/
@Data
public class InstTaskRepayDesire {

    /**
     * 主键Id
     */
    private Long id;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 跟进任务id
     */
    private Long instRuleTrackTaskId;
    /**
     * 跟进历史id
     */
    private Long instTaskHistoryId;
    /**
     * 意向来源：1：客户表达、2：非交互式
     */
    private Byte desireFrom;
    /**
     * 状态 【1未处理、2回款中、3部分回款、4等待重试、5已还款、6还款失败、7取消、8忽略】
     */
    private Byte status;
    /**
     * 目标还款金额
     */
    private BigDecimal goalAmount;
    /**
     * 协商还款金额
     */
    private BigDecimal consultAmount;
    /**
     * 协商还款时间
     */
    private Date consultRepayTime;
    /**
     * 已回款金额
     */
    private BigDecimal receivedAmount;
    /**
     * 重试次数
     */
    private Integer retryCount;
    /**
     * 下次处理时间
     */
    private Date nextHandleTime;
    /**
     * 案件id
     */
    private Long caseId;
    /**
     * 是否减免
     */
    private Boolean reduceFlag;
}