package com.puhui.bean.outsourcing;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName RepayCaseManage
 * @Description 委外案件自动抽取规则
 * @Author JiaZhang
 * @Date 2018/12/28 19:25 PM
 * @Version 1.0
 **/
@Data
public class OutsourcingAutoExtractNorm {

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
     * 规则名称
     */
    private String normName;
    /**
     * 规则优先级
     */
    private Integer normPriority;
    /**
     * 委托方
     */
    private Long clientId;
    /**
     * 抽取条件
     */
    private String extractCondition;
    /**
     * 抽取方式
     */
    private String extractModel;
    /**
     * 抽取类型
     */
    private Integer extractType;
    /**
     * 抽取值
     */
    private String extractValue;
    /**
     * 备注
     */
    private String remark;
}