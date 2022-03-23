package com.puhui.bean.outsourcing;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName RepayCaseManage
 * @Description 委外公司表
 * @Author JiaZhang
 * @Date 2018/12/28 19:48 PM
 * @Version 1.0
 **/
@Data
public class OutsourcingOrg {

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
     * 委外公司名称
     */
    private String orgName;
    /**
     * 委外公司代码
     */
    private String orgCode;
    /**
     * 联系人
     */
    private String contacts;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 签约日期
     */
    private Date contractDate;
    /**
     * 解约日期
     */
    private Date cancellationDate;
    /**
     * 发委方式
     */
    private Byte sendMode;
    /**
     * 是否有效
     */
    private Byte valid;
}