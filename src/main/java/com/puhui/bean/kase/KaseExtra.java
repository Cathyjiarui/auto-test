package com.puhui.bean.kase;

import lombok.Data;

import java.util.Date;

/**
  * @ClassName KaseExtra
  * @Description 案件额外信息表
  * @Author JiaZhang
  * @Date 2018/12/29 1:45 PM
  * @Version 1.0
**/
@Data
public class KaseExtra {

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
     * 案件基本信息ID
     */
    private Long kaseContractId;
    /**
     * 是否是存管账户
     */
    private Boolean deposit;
    /**
     * 展期(个贷)
     */
    private Byte extensionFlag;
    /**
     * 划扣主体
     */
    private String paymentBody;
    /**
     * 保理商户名称
     */
    private String shopName;
    /**
     * 保理商品名称
     */
    private String goodsName;
    /**
     * 客户发薪日
     */
    private Date customerPayDay;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 业务交易ID
     */
    private String businessTransactionId;
    /**
     * 指定客群(个贷)
     */
    private String specifiedGroup;
    /**
     * (个贷)销售离职标示 0否 1是
     */
    private Boolean salesDimission;
}