package com.puhui.mapper.kase;

import com.puhui.bean.kase.KaseMergeNorm;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface KaseMergeNormMapper {
    @Delete({
        "delete from kase_merge_norm",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into kase_merge_norm (id, create_time, ",
        "update_time, norm_name, ",
        "channel_collection, remark, ",
        "valid)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{normName,jdbcType=VARCHAR}, ",
        "#{channelCollection,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR}, ",
        "#{valid,jdbcType=BIT})"
    })
    int insert(KaseMergeNorm record);

    @Select({
        "select",
        "id, create_time, update_time, norm_name, channel_collection, remark, valid",
        "from kase_merge_norm",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="norm_name", property="normName", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel_collection", property="channelCollection", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="valid", property="valid", jdbcType=JdbcType.BIT)
    })
    KaseMergeNorm selectByPrimaryKey(Long id);

    @Update({
        "update kase_merge_norm",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "norm_name = #{normName,jdbcType=VARCHAR},",
          "channel_collection = #{channelCollection,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "valid = #{valid,jdbcType=BIT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(KaseMergeNorm record);
}