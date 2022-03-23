package com.puhui.bean.inst;

import lombok.Data;

import java.util.Date;

/**
  * @ClassName InstCollectionTool
  * @Description 催收工具表
  * @Author JiaZhang
  * @Date 2018/12/29 4:38 PM
  * @Version 1.0
**/
@Data
public class InstCollectionTool {

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
     * 工具名称
     */
    private String toolName;
    /**
     * 备注
     */
    private String remark;
}