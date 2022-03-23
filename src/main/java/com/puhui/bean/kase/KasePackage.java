package com.puhui.bean.kase;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
  * @ClassName KasePackage
  * @Description 案件包信息表
  * @Author JiaZhang
  * @Date 2018/12/29 4:15 PM
  * @Version 1.0
**/
@Data
public class KasePackage {

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
     * 唯一标识码
     */
    private String identifier;
    /**
     * 客户ID
     */
    private Long customerId;
    /**
     * 当前催收员ID
     */
    private Long currentCollectorId;
    /**
     * 流入时间
     */
    private Date inflowTime;
    /**
     * 结案时间
     */
    private Date closureTime;
    /**
     * 逾期级别
     */
    private Integer overdueLevel;
    /**
     * 逾期天数
     */
    private Integer overdueDays;
    /**
     * 剩余本金
     */
    private BigDecimal surplusPrincipal;
    /**
     * 最新加案时间
     */
    private Date latestAppendTime;
    /**
     * 最新回退时间
     */
    private Date latestRollbackTime;
    /**
     * 是否已关闭
     */
    private Boolean closed;
    /**
     * 关闭时间
     */
    private Date closedTime;
    /**
     * 分配状态
     */
    private Boolean assigned;
}