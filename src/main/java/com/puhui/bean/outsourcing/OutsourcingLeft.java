package com.puhui.bean.outsourcing;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName RepayCaseManage
 * @Description 委外留案记录
 * @Author JiaZhang
 * @Date 2018/12/28 19:46 PM
 * @Version 1.0
 **/
@Data
public class OutsourcingLeft {

    /**
     * 主键
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
     * 委外案件手别id
     */
    private Long outsourcingTimelevelId;
    /**
     * 委外公司id
     */
    private Long outsourcingOrgId;
    /**
     * 委外批次id
     */
    private Long outsourcingBatchId;
    /**
     * 案件id
     */
    private Long caseId;
    /**
     * 核心进件号
     */
    private Long coreRequestId;
    /**
     * 留案时的委外状态 1：委案中 2:提前撤委 3:手工撤委 4:停催撤委 5:结委
     */
    private Byte status;
    /**
     * 留案备注
     */
    private String remark;
}