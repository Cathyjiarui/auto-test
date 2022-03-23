package com.puhui.bean.kase;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
  * @ClassName KaseContract
  * @Description 案件合同信息表
  * @Author JiaZhang
  * @Date 2018/12/29 11:35 AM
  * @Version 1.0
**/
@Data
public class KaseContract {
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
     * 业务线案件ID
     */
    private Long requestId;
    /**
     * 资产服务案件ID
     */
    private Long assetRequestId;
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
     * 合同编号
     */
    private String contractNo;
    /**
     * 放款金额
     */
    private BigDecimal loanAmount;
    /**
     * 放款日期
     */
    private Date loanDate;
    /**
     * 借款用途
     */
    private String loanPurpose;
    /**
     *
     */
    private Integer loanPeriod;
    /**
     * 签约金额
     */
    private BigDecimal contractedAmount;
    /**
     * 签约日期
     */
    private Date contractDate;
    /**
     * 账单日
     */
    private Integer billDate;
    /**
     * 月综合费率
     */
    private BigDecimal monthlyTotalRate;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 结清状态
     */
    private Boolean settleStatus;
    /**
     * 销售员、销售人员
     */
    private String salespeople;
    /**
     * 销售人员id
     */
    private Long seller;
    /**
     * 销售人员姓名
     */
    private String sellerName;
    /**
     * 客服人员id
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
     * 大数据编号
     */
    private String bigDataNo;
}