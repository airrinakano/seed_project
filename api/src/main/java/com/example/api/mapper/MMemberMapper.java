package com.example.api.mapper;

import com.example.api.domain.MMember;
import com.example.api.domain.MMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MMemberMapper {
    @Insert({
        "insert into m_member (member_id, first_name, ",
        "last_name, pass_word, ",
        "init_email, address_name, ",
        "admin_flag, created_by, ",
        "created_at, updated_by, ",
        "updated_at, delete_flag)",
        "values (#{memberId,jdbcType=INTEGER}, #{firstName,jdbcType=VARCHAR}, ",
        "#{lastName,jdbcType=VARCHAR}, #{passWord,jdbcType=VARCHAR}, ",
        "#{initEmail,jdbcType=VARCHAR}, #{addressName,jdbcType=VARCHAR}, ",
        "#{adminFlag,jdbcType=BIT}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedBy,jdbcType=VARCHAR}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{deleteFlag,jdbcType=BIT})"
    })
    int insert(MMember record);

    int insertSelective(MMember record);

    List<MMember> selectByExample(MMemberExample example);

    @Select({
        "select",
        "member_id, first_name, last_name, pass_word, init_email, address_name, admin_flag, ",
        "created_by, created_at, updated_by, updated_at, delete_flag",
        "from m_member",
        "where member_id = #{memberId,jdbcType=INTEGER}"
    })
    @ResultMap("com.example.api.mapper.MMemberMapper.BaseResultMap")
    MMember selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(MMember record);

    @Update({
        "update m_member",
        "set first_name = #{firstName,jdbcType=VARCHAR},",
          "last_name = #{lastName,jdbcType=VARCHAR},",
          "pass_word = #{passWord,jdbcType=VARCHAR},",
          "init_email = #{initEmail,jdbcType=VARCHAR},",
          "address_name = #{addressName,jdbcType=VARCHAR},",
          "admin_flag = #{adminFlag,jdbcType=BIT},",
          "created_by = #{createdBy,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "delete_flag = #{deleteFlag,jdbcType=BIT}",
        "where member_id = #{memberId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MMember record);
}