package com.puhui.bean.outsourcing;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName RepayCaseManage
 * @Description 委外批次与委外案件关系
 * @Author JiaZhang
 * @Date 2018/12/28 19:37 PM
 * @Version 1.0
 **/
@Data
public class OutsourcingKaseBatchRelation {

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
     * 发委时间
     */
    private Date sendTime;
    /**
     * 案件包ID
     */
    private Long kasePackageId;
    /**
     * 委外案件ID
     */
    private Long outKaseId;
    /**
     * 委外批次ID
     */
    private Long outBatchId;
    /**
     * 入批方式 枚举 发委 自动加案 留案 手工加案
     */
    private Long entryBatchType;
    /**
     * 委案状态 枚举 委案中 提前撤委 手工撤委 停催撤委 结委
     */
    private Long status;
    /**
     * 撤委原因
     */
    private String revokeReason;
    /**
     * 发委时一次性结清金额
     */
    private Double sendSquareUp;
    /**
     * 发委时剩余本金
     */
    private Double sendSurplusPrincipal;
    /**
     * 发委时逾期期数
     */
    private Double sendOverduePeriod;
    /**
     * 发委时案件所属账单日
     */
    private Double sendThisCycle;
    /**
     * 发委时应还期数
     */
    private Double sendLendPhase;
    /**
     * 发委时逾期总额
     */
    private Double sendOverdueTotal;
    /**
     * 发委时逾期本息
     */
    private Double sendOverduePrincipalInterest;
    /**
     * 结委时剩余本金
     */
    private Double endSurplusPrincipal;
    /**
     * 结委时一次性结清金额
     */
    private Double endSquareUp;
    /**
     * 结委案件所属账单日
     */
    private Double endThisCycle;
    /**
     * 结委时应还期数
     */
    private Double endLendPhase;
    /**
     * 结委时逾期期数
     */
    private Double endOverduePeriod;
    /**
     * 结委时逾期本息
     */
    private Double endOverduePrincipalInterest;
    /**
     * 结委时逾期总额
     */
    private Double endOverdueTotal;
}