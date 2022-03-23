package com.puhui.bean.outsourcing;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName RepayCaseManage
 * @Description 委外批次
 * @Author JiaZhang
 * @Date 2018/12/28 19:27 PM
 * @Version 1.0
 **/
@Data
public class OutsourcingBatch {

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
     * 委外公司ID
     */
    private Long outOrgId;
    /**
     * 委外包ID
     */
    private Long outPackageId;
    /**
     * 批次号
     */
    private String batchNo;
    /**
     * 批次类型 枚举 新委 续委（字典）
     */
    private Long batchType;
    /**
     * 批次生成方式 枚举 定制 分配（字典）
     */
    private Long batchGenerateType;
    /**
     * 批次生成时间
     */
    private Date generateTime;
    /**
     * 委托金额时间对齐方式 枚举 发委时刻 月初（字典）
     */
    private Long timeAlignType;
    /**
     * 发委时间
     */
    private Date sendTime;
    /**
     * 计划结委时间
     */
    private Date planEndTime;
    /**
     * 状态 待发委 委案中 提前结委 到期结委
     */
    private Integer status;
    /**
     * 发委人
     */
    private Long sendUserId;
    /**
     * 批次文件名
     */
    private String fileUrl;
    /**
     * 批次文件地址（七牛）
     */
    private String unzipCode;
    /**
     * 批次文件解压密码
     */
    private String fileName;
}