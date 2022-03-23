package com.puhui.bean.outsourcing;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName RepayCaseManage
 * @Description 委外案件线上发送记录表
 * @Author JiaZhang
 * @Date 2018/12/28 19:51 PM
 * @Version 1.0
 **/
@Data
public class OutsourcingSendRecord {

    /**
     * 主键
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
     * 委外公司id
     */
    private Long outOrgId;
    /**
     * 委外案件id
     */
    private Long outKaseId;
    /**
     * 委外批次id
     */
    private Long outBatchId;
    /**
     * 委外批次与委外关系id
     */
    private Long kaseBatchRelationId;
    /**
     * 起委时间
     */
    private Date startOutDate;
    /**
     * 结委时间
     */
    private Date endOutDate;
    /**
     * 机构委外类型 0初始状态、1钱站委外、2个贷委外、3钒卡委外、4、任买委外...
     */
    private Byte outType;
    /**
     * 状态：1待发送；2在催；3发送失败；4舍弃不发送、5已结委、6待撤委
     */
    private Byte status;
    /**
     * 机构批次号
     */
    private String orgBatchNo;
    /**
     * 接口返回值
     */
    private String respResult;
    /**
     * 撤销案件结果
     */
    private String revokeResult;
}