package com.gm.mapper;

import com.gm.pojo.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: gm
 * @createTime 2023/5/25 20:32
 * @description:
 */

@Mapper
public interface PeopleMapper {

 /**
  * 查询所有
 */
 @Select("select * from people")
 public List<People> findAll();

 /**
  * 根据id查询
 */
 public People findOne(@Param("id") Integer id);
}
