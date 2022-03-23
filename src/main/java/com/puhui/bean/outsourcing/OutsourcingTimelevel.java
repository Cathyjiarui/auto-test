package com.puhui.bean.outsourcing;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName RepayCaseManage
 * @Description 委外案件手别
 * @Author JiaZhang
 * @Date 2018/12/28 19:55 PM
 * @Version 1.0
 **/
@Data
public class OutsourcingTimelevel {

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
     * 委托方service_user_id
     */
    private Long clientId;
    /**
     * 起委时间
     */
    private Date startDate;
    /**
     * 结委时间
     */
    private Date endDate;
    /**
     * 开启或关闭
     */
    private Boolean closed;
    /**
     * 委外时间序列手别
     */
    private Long outTimeLevel;
}