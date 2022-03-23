package com.puhui.bean.repay;

import lombok.Data;

import java.util.Date;

/**
  * @ClassName RepayCaseManage
  * @Description 案件表
  * @Author JiaZhang
  * @Date 2018/12/29 5:17 PM
  * @Version 1.0
**/
@Data
public class RepayCaseManage {

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
     * 账户类型（字典）
     */
    private Long accountType;
    /**
     * 还款日
     */
    private Integer billDate;
    /**
     * 当前催收方式（字典）
     */
    private Long collectionMethods;
    /**
     * 案件催收状态（字典）
     */
    private Long collectionStatus;
    /**
     * 催收人员ID
     */
    private Long collectionUserId;
    /**
     * 催收人员姓名
     */
    private String collectionUserName;
    /**
     * 进件合同编号
     */
    private String contractCode;
    /**
     * 客户ID
     */
    private Long customerId;
    /**
     * 分配状态: 1:未分配；2:已分配
     */
    private Integer distributionStatus;
    /**
     * 终审结论
     */
    private String finalTrialDesc;
    /**
     * 初审结论
     */
    private String firstTrialDesc;
    /**
     * 最早逾期还款日
     */
    private Date lastRepayDate;
    /**
     * 应还期数
     */
    private Integer lendPhase;
    /**
     * 放款金额
     */
    private Double loanAmount;
    /**
     * 放款利息
     */
    private Double loanInterest;
    /**
     * 放款本金
     */
    private Double loanPrincipal;
    /**
     * 借款用途
     */
    private String loanPurpose;
    /**
     * 月还款额
     */
    private Double monthlyRepay;
    /**
     * 月综合费率
     */
    private Double monthlyTotalRate;
    /**
     * 当前逾期状态(逾期期数)
     */
    private Integer nowOverdueStatus;
    /**
     * 所属机构： REPAY:贷后；LEND:个贷
     */
    private String organization;
    /**
     * 立案逾期状态(逾期期数)
     */
    private Integer overdueStatus;
    /**
     * 当前逾期总额
     */
    private Double overdueTotal;
    /**
     * 工作目标（1：回C，2：结清）
     */
    private Integer inhouseTarget;
    /**
     * 放款日期
     */
    private Date passTime;
    /**
     * 借款期数
     */
    private Integer period;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 还款情况：1：未偿还；2：部分偿还；3：阶段偿还；4：全部偿还；5：已结清
     */
    private Integer repayStatus;
    /**
     * 最后还款情况变动时间
     */
    private Date repayStatusTime;
    /**
     * 委托方进件ID
     */
    private Long requestId;
    /**
     * 委托方核心进件ID
     */
    private Long coreRequestId;
    /**
     * 销售员、销售人员
     */
    private String salespeople;
    /**
     * 案件来源（委托方）
     */
    private Long serviceUserId;
    /**
     * 签约金额
     */
    private Double signedAmount;
    /**
     * 案件处理状态：1:进行中； 2:结束；
     */
    private Integer status;
    /**
     * 门店所属市
     */
    private String storeCity;
    /**
     * 所属机构、门店ID
     */
    private Long storeId;
    /**
     * 所属机构、门店名称
     */
    private String storeName;
    /**
     * 门店所属省
     */
    private String storeProvince;
    /**
     * 门店所属市
     */
    private Double surplusPrincipal;
    /**
     * 是否自动划扣
     */
    private Boolean autoDeduct;
    /**
     * 分案时间
     */
    private Date distributionDate;
    /**
     * 部门ID
     */
    private Long departmentId;
    /**
     * 初始剩余本金
     */
    private Double initSurplusPrincipal;
    /**
     * 初始逾期总额
     */
    private Double initOverdueTotal;
    /**
     * 是否C-M1
     */
    private Boolean cM;
    /**
     * 后续行动
     */
    private Long followUp;
    /**
     * 销售人员id
     */
    private Long seller;
    /**
     * 销售人员姓名
     */
    private String sellerName;
    /**
     * 销售人员姓名
     */
    private Long submiter;
    /**
     * 客服人员姓名
     */
    private String submiterName;
    /**
     * 销售团队id
     */
    private Long sellGroup;
    /**
     * 销售团队名称
     */
    private String sellGroupName;
    /**
     * 大数据唯一标识
     */
    private String bigdataNo;
    /**
     * 案件流程标记
     */
    private String queueCode;
    /**
     * 委外案件流程标识
     */
    private String osQueueCode;
    /**
     * 是否是新案
     */
    private Boolean isNewCase;
    /**
     * 拨打类型
     */
    private Integer callType;
    /**
     * 案件所属账单日
     */
    private Date thisCycle;
    /**
     * 决策码
     */
    private String decisionCode;
    /**
     * 决策打分
     */
    private Double decisionScore;
    /**
     * 主案件id
     */
    private Long mainId;
    /**
     * 案件所属来源渠道id
     */
    private Long channelId;
    /**
     * 是否特殊队列 1是0否
     */
    private Boolean isSpecialQueue;
    /**
     * 是否存管账户标记 0：否；1：是
     */
    private Boolean isDeposit;
    /**
     * 是否委外案件 0 否 1是
     */
    private Byte isOutsourcing;
    /**
     * 是否为欺诈账户 1是 0否
     */
    private Byte isFraud;
    /**
     * openLine是否需要页面标签(0:不需要;1:需要;)
     */
    private Byte newCaseFlag;
    /**
     * 轻度逾期结束时间
     */
    private Date lightOverDueEndDate;
    /**
     * 是否轻度逾期
     */
    private Boolean isLightOverDue;
    /**
     * 承诺还款时间（记录最后一次）
     */
    private Date ptpTime;
    /**
     * 特殊委外案件标识 1是 0否
     */
    private Long specialOutsrcId;
    /**
     * 账户类型
     */
    private String loanChannelType;
    /**
     * 签约时间
     */
    private Date signedDate;
    /**
     * 分配状态，0未分配，1分配给上海，2分配给合肥，3、分配给个贷门店,4 、案件分配到成都 5、 案件分配到北京 6、案件分配到成都集团
     */
    private Integer allocationStatus;
    /**
     * 是否更新轻度催收的时间（更新为7天）,默认否
     */
    private Byte whetherUpdLightDate;
    /**
     * 知识图谱预测式评分值（案件标识）
     */
    private Integer maPrediction;
    /**
     * 知识图谱预测式评分值（处理标识）
     */
    private Integer handlePrediction;
    /**
     * 是否特殊提前委外
     */
    private Boolean isAdvanceout;
    /**
     * c卡分级标签
     */
    private Integer label;
    /**
     * c卡分数
     */
    private Integer score;
    /**
     * 特殊结清资格 0:初始化 1:有资格 2:无资格
     */
    private Byte specialSettleQualification;
    /**
     * c卡2.0分级标签
     */
    private Integer label2;
    /**
     * c卡2.0分数
     */
    private Integer score2;
    /**
     * 0:内催 1:资易通回退委外 2:资易通结清委外
     */
    private Byte outSourcingAllocationStatus;
    /**
     * 流入时间c-m1时间
     */
    private Date inflowTime;
    /**
     * 展期状态 0 未申请展期 1 结清展期已申请，展期已放款，未结清 2 结清展期已申请，展期未放款，未结清 3 其他
     */
    private Byte extensionFlag;
    /**
     * 案件生命周期id
     */
    private Long caseReportId;
    /**
     * 案件优先级 1 高 2中 3低
     */
    private Boolean caseLevel;
    /**
     * m2Old抽取内催:0待处理、1内催、2委外
     */
    private Byte m2OldExtraction;
    /**
     * 催收记录时间
     */
    private Date collectionRecordTime;
    /**
     * 案件集的流转记录id
     */
    private Long caseUnitFlowId;
    /**
     * 客群id
     */
    private Long customerGroupId;
    /**
     * 是否门店留案
     */
    private Boolean keepInStore;
    /**
     * 钒卡案件id
     */
    private Long fancardId;
    /**
     * 所属催收方式
     */
    private Long collectionModeId;
}