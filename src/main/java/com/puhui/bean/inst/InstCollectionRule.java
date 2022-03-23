package com.puhui.bean.inst;

import lombok.Data;

import java.util.Date;

/**
  * @ClassName InstCollectionRule
  * @Description 催收工具跟进规则
  * @Author JiaZhang
  * @Date 2018/12/29 4:36 PM
  * @Version 1.0
**/
@Data
public class InstCollectionRule {

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
     * 催收工具id
     */
    private Long instCollectionToolId;
    /**
     * 规则名称
     */
    private String name;
    /**
     * 自动跟进配置
     */
    private String cron;
    /**
     * 是否减免
     */
    private Boolean reduceFlag;
    /**
     * 1 客户维度、2 案件维度
     */
    private Byte dimensionFlag;
    /**
     * 短信模版id
     */
    private Long smsTemplateId;
}