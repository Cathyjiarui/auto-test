package com.puhui.bean.outsourcing;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName RepayCaseManage
 * @Description 委外特殊队列表
 * @Author JiaZhang
 * @Date 2018/12/28 19:57 PM
 * @Version 1.0
 **/
@Data
public class OutsuorcingSpecial {

    /**
     * 自增id
     */
    private Integer id;
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
     * 资产服务方进件号
     */
    private Long assetRequestId;
    /**
     * 状态 0开启/1关闭
     */
    private Boolean state;
    /**
     * 备注
     */
    private String remark;
}