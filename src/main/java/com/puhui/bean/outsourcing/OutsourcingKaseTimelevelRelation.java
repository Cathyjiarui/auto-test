package com.puhui.bean.outsourcing;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName RepayCaseManage
 * @Description 委外案件手别与委外案件关系表
 * @Author JiaZhang
 * @Date 2018/12/28 19:42 PM
 * @Version 1.0
 **/
@Data
public class OutsourcingKaseTimelevelRelation {

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
     * 委外手别ID
     */
    private Long outTimelevelId;
    /**
     * 委外案件ID
     */
    private Long outKaseId;
}