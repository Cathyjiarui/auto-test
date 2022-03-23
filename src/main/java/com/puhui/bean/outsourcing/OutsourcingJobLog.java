package com.puhui.bean.outsourcing;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName RepayCaseManage
 * @Description 定时任务执行记录
 * @Author JiaZhang
 * @Date 2018/12/28 19:32 PM
 * @Version 1.0
 **/
@Data
public class OutsourcingJobLog {

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
     * 任务ID
     */
    private Long jobId;
    /**
     * 执行日期
     */
    private Integer executeDate;
    /**
     * 开始时间
     */
    private Date startTime;
    /**
     * 结束时间
     */
    private Date endTime;
    /**
     * 结束时间
     */
    private Integer totalCount;
    /**
     * 成功记录数
     */
    private Integer successCount;
    /**
     * 失败记录数
     */
    private Integer errorCount;
    /**
     * 执行方式
     */
    private Byte executionType;
    /**
     * 执行者
     */
    private String executor;
    /**
     * 执行状态
     */
    private Byte executionStatus;
}