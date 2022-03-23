package com.puhui.bean.kase;

import lombok.Data;

import java.util.Date;

/**
  * @ClassName KaseOverdueCaseManageMapping
  * @Description 原案件与新案件关系映射表
  * @Author JiaZhang
  * @Date 2018/12/29 3:50 PM
  * @Version 1.0
**/
@Data
public class KaseOverdueCaseManageMapping {

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
     * 案件逾期信息表ID
     */
    private Long kaseOverdueId;
    /**
     * 原案件表ID
     */
    private Long caseId;
}