package com.example.api.mapper;

import com.example.api.domain.MProduct;
import com.example.api.domain.MProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MProductMapper {
    @Insert({
        "insert into m_product (product_id, product_name, ",
        "unit_price, tax, ",
        "created_by, created_at, ",
        "updated_by, updated_at, ",
        "delete_flag)",
        "values (#{productId,jdbcType=INTEGER}, #{productName,jdbcType=VARCHAR}, ",
        "#{unitPrice,jdbcType=INTEGER}, #{tax,jdbcType=INTEGER}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedBy,jdbcType=VARCHAR}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{deleteFlag,jdbcType=BIT})"
    })
    int insert(MProduct record);

    int insertSelective(MProduct record);

    List<MProduct> selectByExample(MProductExample example);

    @Select({
        "select",
        "product_id, product_name, unit_price, tax, created_by, created_at, updated_by, ",
        "updated_at, delete_flag",
        "from m_product",
        "where product_id = #{productId,jdbcType=INTEGER}"
    })
    @ResultMap("com.example.api.mapper.MProductMapper.BaseResultMap")
    MProduct selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(MProduct record);

    @Update({
        "update m_product",
        "set product_name = #{productName,jdbcType=VARCHAR},",
          "unit_price = #{unitPrice,jdbcType=INTEGER},",
          "tax = #{tax,jdbcType=INTEGER},",
          "created_by = #{createdBy,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "delete_flag = #{deleteFlag,jdbcType=BIT}",
        "where product_id = #{productId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MProduct record);
}