package com.puhui.bean.outsourcing;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName RepayCaseManage
 * @Description 委外批次与自动抽取规则关系
 * @Author JiaZhang
 * @Date 2018/12/28 19:29 PM
 * @Version 1.0
 **/
@Data
public class OutsourcingBatchNormRelation {

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
     * 委外批次ID
     */
    private Long outBatchId;
    /**
     * 自动抽取规则ID
     */
    private Long outNormId;
    /**
     * 委外机构id
     */
    private Long orgId;
    /**
     * 自动抽取比例
     */
    private BigDecimal extractValue;
}