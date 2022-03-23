package com.puhui.bean.inst;

import lombok.Data;

import java.util.Date;

/**
  * @ClassName InstTaskHistory
  * @Description 催收工具跟进任务历史
  * @Author JiaZhang
  * @Date 2018/12/29 4:58 PM
  * @Version 1.0
**/
@Data
public class InstTaskHistory {

    /**
     * 主键id
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
     * 催收工具跟进任务id
     */
    private Long instRuleTrackTaskId;
    /**
     * 预约跟进时间
     */
    private Date appointTrackTime;
    /**
     * 结束跟踪时间
     */
    private Date endTrackTime;
    /**
     * 1未开始, 2交互中, 3结束-交互失败, 4结束-任务到期结束, 5结束-正常结束
     */
    private Byte status;
    /**
     * 一级码
     */
    private String firstLevelStatus;
    /**
     * 二级码
     */
    private String secondLevelStatus;
    /**
     * 映射结束码
     */
    private String mappingStatus;
    /**
     * 映射状态码简介
     */
    private String mappingStatusDesc;
}