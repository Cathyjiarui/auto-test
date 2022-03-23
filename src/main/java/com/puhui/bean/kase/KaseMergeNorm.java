package com.puhui.bean.kase;

import lombok.Data;

import java.util.Date;

/**
  * @ClassName KaseMergeNorm
  * @Description 并案规则表
  * @Author JiaZhang
  * @Date 2018/12/29 1:49 PM
  * @Version 1.0
**/
@Data
public class KaseMergeNorm {

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
     * 规则名称
     */
    private String normName;
    /**
     * 渠道集合-逗号分隔的渠道ID
     */
    private String channelCollection;
    /**
     * 规则说明
     */
    private String remark;
    /**
     * 是否有效
     */
    private Boolean valid;
}