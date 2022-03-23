package com.puhui.bean.kase;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
  * @ClassName KaseOverdue
  * @Description 案件逾期信息表
  * @Author JiaZhang
  * @Date 2018/12/29 3:45 PM
  * @Version 1.0
**/
@Data
public class KaseOverdue {

    /**
     * 主键ID
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
     * 案件所属账单日
     */
    private Date thisCycle;
    /**
     * 账户类型
     */
    private String loanChannelType;
    /**
     * 最早逾期还款日
     */
    private Date lastRepayDate;
    /**
     * 流入贷后时间
     */
    private Date inflowTime;
    /**
     * 流出贷后时间
     */
    private Date outflowTime;
    /**
     * 客户账户ID
     */
    private Long customerAccountId;
    /**
     * 业务线ID
     */
    private Long lobId;
    /**
     * 渠道ID
     */
    private Long channelId;
    /**
     * 案件ID
     */
    private Long kaseContractId;
    /**
     * 案件包ID
     */
    private Long kasePackageId;
    /**
     * 业务方进件ID
     */
    private Long requestId;
    /**
     * 资产服务案件ID
     */
    private Long assetRequestId;
    /**
     * 初始逾期状态
     */
    private Integer initOverduePeriod;
    /**
     * 当前逾期状态
     */
    private Integer currentOverduePeriod;
    /**
     * 逾期天数
     */
    private Integer overdueDays;
    /**
     * 应还期数
     */
    private Integer lendPhase;
    /**
     * 初始逾期总额
     */
    private BigDecimal initOverdueTotal;
    /**
     * 当前逾期总额
     */
    private BigDecimal currentOverdueTotal;
    /**
     * 初始剩余本金
     */
    private BigDecimal initSurplusPrincipal;
    /**
     * 当前剩余本金
     */
    private BigDecimal currentSurplusPrincipal;
    /**
     * 放款本金
     */
    private BigDecimal loanPrincipal;
    /**
     * 放款利息
     */
    private BigDecimal loanInterest;
    /**
     * 月还款额
     */
    private BigDecimal monthlyRepay;
    /**
     * 是否C-M1
     */
    private Boolean cm;
    /**
     * 是否新案
     */
    private Boolean newCase;
    /**
     * 是否已结束
     */
    private Boolean closed;
}