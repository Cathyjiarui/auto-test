package com.puhui.bean.outsourcing;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName RepayCaseManage
 * @Description 委外案件
 * @Author JiaZhang
 * @Date 2018/12/28 19:35 PM
 * @Version 1.0
 **/
@Data
public class OutsourcingKase {

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
     * 流入时间
     */
    private Date inflowTime;
    /**
     * 当前委外状态 1：委案中 2:提前撤委 3:手工撤委 4:停催撤委 5:结委
     */
    private Integer status;
    /**
     * 进件号
     */
    private Long requestId;
    /**
     * 资产服务方进件号
     */
    private Long assetRequestId;
    /**
     * 案件包ID
     */
    private Long kasePackageId;
    /**
     * 案件逾期信息ID
     */
    private Long kaseId;
    /**
     * 委托方Service_user_id
     */
    private Long clientId;
    /**
     * 客户id
     */
    private Long customerId;
    /**
     * 客户姓名
     */
    private String customerName;
    /**
     * 合同编号
     */
    private String contractCode;
    /**
     * 客户手机号
     */
    private String customerPhone;
    /**
     * 客户身份证号
     */
    private String customerIdNo;
    /**
     * 放款日期
     */
    private Date passTime;
    /**
     * 还款日
     */
    private Integer billDate;
    /**
     * 渠道id
     */
    private Long channelId;
    /**
     * 门店id
     */
    private Long storeId;
    /**
     * 门店名称
     */
    private String storeName;
    /**
     * 是否被定时处理
     */
    private Byte scanFlag;
}