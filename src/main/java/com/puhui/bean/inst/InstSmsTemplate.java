package com.puhui.bean.inst;

import lombok.Data;

import java.util.Date;

/**
  * @ClassName InstSmsTemplate
  * @Description 短信模版
  * @Author JiaZhang
  * @Date 2018/12/29 4:57 PM
  * @Version 1.0
**/
@Data
public class InstSmsTemplate {

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
     * 模版名称
     */
    private String templateName;
    /**
     * 模板正文
     */
    private String templateContent;
    /**
     * 0 无效，1有效
     */
    private Boolean valid;
    /**
     * 备注
     */
    private String remark;
}