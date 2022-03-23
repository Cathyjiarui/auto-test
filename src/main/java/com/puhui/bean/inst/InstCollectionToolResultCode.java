package com.puhui.bean.inst;

import lombok.Data;

import java.util.Date;

/**
  * @ClassName InstCollectionToolResultCode
  * @Description 催收工具结果码表
  * @Author JiaZhang
  * @Date 2018/12/29 4:40 PM
  * @Version 1.0
**/
@Data
public class InstCollectionToolResultCode {

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
     * 催收工具ID
     */
    private Long collectionToolId;
    /**
     * 一级结束码
     */
    private String firstLevelStatus;
    /**
     * 二级结束码
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