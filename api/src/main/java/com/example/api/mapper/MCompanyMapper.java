package com.example.api.mapper;

import com.example.api.domain.MCompany;
import com.example.api.domain.MCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MCompanyMapper {
    @Insert({
        "insert into m_company (company_id, company_name, ",
        "system_login, shared_secret, ",
        "po_url, cxml_id, cxml_password, ",
        "created_by, created_at, ",
        "updated_by, updated_at, ",
        "delete_flag)",
        "values (#{companyId,jdbcType=INTEGER}, #{companyName,jdbcType=VARCHAR}, ",
        "#{systemLogin,jdbcType=VARCHAR}, #{sharedSecret,jdbcType=VARCHAR}, ",
        "#{poUrl,jdbcType=VARCHAR}, #{cxmlId,jdbcType=VARCHAR}, #{cxmlPassword,jdbcType=VARCHAR}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedBy,jdbcType=VARCHAR}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{deleteFlag,jdbcType=BIT})"
    })
    int insert(MCompany record);

    int insertSelective(MCompany record);

    List<MCompany> selectByExample(MCompanyExample example);

    @Select({
        "select",
        "company_id, company_name, system_login, shared_secret, po_url, cxml_id, cxml_password, ",
        "created_by, created_at, updated_by, updated_at, delete_flag",
        "from m_company",
        "where company_id = #{companyId,jdbcType=INTEGER}"
    })
    @ResultMap("com.example.api.mapper.MCompanyMapper.BaseResultMap")
    MCompany selectByPrimaryKey(Integer companyId);

    int updateByPrimaryKeySelective(MCompany record);

    @Update({
        "update m_company",
        "set company_name = #{companyName,jdbcType=VARCHAR},",
          "system_login = #{systemLogin,jdbcType=VARCHAR},",
          "shared_secret = #{sharedSecret,jdbcType=VARCHAR},",
          "po_url = #{poUrl,jdbcType=VARCHAR},",
          "cxml_id = #{cxmlId,jdbcType=VARCHAR},",
          "cxml_password = #{cxmlPassword,jdbcType=VARCHAR},",
          "created_by = #{createdBy,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "delete_flag = #{deleteFlag,jdbcType=BIT}",
        "where company_id = #{companyId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MCompany record);
}