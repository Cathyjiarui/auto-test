package com.puhui.bean.repay;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName RepayDepartment
 * @Description 部门管理表
 * @Author JiaZhang
 * @Date 2018/12/22 3:24 PM
 * @Version 1.0
 **/
@Data
public class RepayDepartment {

    /**
     * 主键id
     */
    private Long id;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 部门编号
     */
    private String code;
    /**
     * 删除标记1删除
     */
    private Integer deleteFlag;
    /**
     * 部门名称
     */
    private String name;
    /**
     * 父部门id
     */
    private Integer parentId;
    /**
     * uc组织部门id
     */
    private Long ucOrgId;
    /**
     * 技能组
     */
    private Integer skillGroup;
}
