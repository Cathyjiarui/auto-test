package com.puhui.bean.inst;

import lombok.Data;

import java.util.Date;

/**
  * @ClassName InstRuleRcgRelation
  * @Description 客群配置的催收工具跟进规则
  * @Author JiaZhang
  * @Date 2018/12/29 4:47 PM
  * @Version 1.0
**/
@Data
public class InstRuleRcgRelation {

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
     * 催收工具跟进规则id
     */
    private Long instCollectionRuleId;
    /**
     * 客群id
     */
    private Long repayCustomerGroupId;
    /**
     * 过期天数
     */
    private Integer expireDays;
    /**
     * 0 无效，1有效
     */
    private Boolean valid;
}