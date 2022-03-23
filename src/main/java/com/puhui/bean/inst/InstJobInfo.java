package com.puhui.bean.inst;

import lombok.Data;

import java.util.Date;

/**
  * @ClassName InstJobInfo
  * @Description 定时任务信息
  * @Author JiaZhang
  * @Date 2018/12/29 4:43 PM
  * @Version 1.0
**/
@Data
public class InstJobInfo {

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
     * 任务名称
     */
    private String jobName;
    /**
     * 父任务ID
     */
    private Long parentId;
    /**
     * cron表达式
     */
    private String cron;
    /**
     * 任务描述
     */
    private String jobDesc;
    /**
     * Handler类
     */
    private String jobClass;
    /**
     * 任务状态
     */
    private Byte jobStatus;
    /**
     * 任务顺序
     */
    private Integer sequence;
    /**
     * 催收规则ID
     */
    private Integer ruleId;
}