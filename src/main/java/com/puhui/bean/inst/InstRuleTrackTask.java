package com.puhui.bean.inst;

import lombok.Data;

import java.util.Date;

/**
  * @ClassName InstRuleTrackTask
  * @Description 催收工具管理跟进任务
  * @Author JiaZhang
  * @Date 2018/12/29 4:53 PM
  * @Version 1.0
**/
@Data
public class InstRuleTrackTask {

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
     * 案件id
     */
    private Long caseId;
    /**
     * 身份证号
     */
    private String idNo;
    /**
     * 案件来源（委托方）
     */
    private Long serviceUserId;
    /**
     * 是否减免
     */
    private Boolean reduceFlag;
    /**
     * 催收工具跟进规则id
     */
    private Long instCollectionRuleId;
    /**
     * 接案时间
     */
    private Date acceptCaseTime;
    /**
     * 首次跟进时间
     */
    private Date firstTrackTime;
    /**
     * 下次跟进时间
     */
    private Date nextTrackTime;
    /**
     * 最后跟进时间
     */
    private Date lastTrackTime;
    /**
     * 计划终止时间
     */
    private Date planTerminateTime;
    /**
     * 实际终止时间
     */
    private Date actualTerminateTime;
    /**
     * 已跟踪次数
     */
    private Integer trackCount;
    /**
     * 1未处理、2跟进中、3回款中、4终止
     */
    private Byte status;
    /**
     * 1到期终止, 2, 回退终止, 3提前终止
     */
    private String statusReason;
}