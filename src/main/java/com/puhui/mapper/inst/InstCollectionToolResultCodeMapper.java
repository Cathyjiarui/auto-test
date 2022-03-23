package com.puhui.mapper.inst;

import com.puhui.bean.inst.InstCollectionToolResultCode;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface InstCollectionToolResultCodeMapper {
    @Delete({
        "delete from inst_collection_tool_result_code",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into inst_collection_tool_result_code (id, create_time, ",
        "update_time, collection_tool_id, ",
        "first_level_status, second_level_status, ",
        "mapping_status, mapping_status_desc)",
        "values (#{id,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{collectionToolId,jdbcType=BIGINT}, ",
        "#{firstLevelStatus,jdbcType=VARCHAR}, #{secondLevelStatus,jdbcType=VARCHAR}, ",
        "#{mappingStatus,jdbcType=VARCHAR}, #{mappingStatusDesc,jdbcType=VARCHAR})"
    })
    int insert(InstCollectionToolResultCode record);

    @Select({
        "select",
        "id, create_time, update_time, collection_tool_id, first_level_status, second_level_status, ",
        "mapping_status, mapping_status_desc",
        "from inst_collection_tool_result_code",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="collection_tool_id", property="collectionToolId", jdbcType=JdbcType.BIGINT),
        @Result(column="first_level_status", property="firstLevelStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="second_level_status", property="secondLevelStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="mapping_status", property="mappingStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="mapping_status_desc", property="mappingStatusDesc", jdbcType=JdbcType.VARCHAR)
    })
    InstCollectionToolResultCode selectByPrimaryKey(Long id);

    @Update({
        "update inst_collection_tool_result_code",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "collection_tool_id = #{collectionToolId,jdbcType=BIGINT},",
          "first_level_status = #{firstLevelStatus,jdbcType=VARCHAR},",
          "second_level_status = #{secondLevelStatus,jdbcType=VARCHAR},",
          "mapping_status = #{mappingStatus,jdbcType=VARCHAR},",
          "mapping_status_desc = #{mappingStatusDesc,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(InstCollectionToolResultCode record);
}