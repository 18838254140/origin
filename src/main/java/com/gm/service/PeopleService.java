package com.gm.service;

import com.gm.mapper.PeopleMapper;
import com.gm.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: gm
 * @createTime 2023/5/25 20:34
 * @description:
 */

@Service
public class PeopleService {

 @Autowired
 PeopleMapper peopleMapper;

 public List<People> findAll(){
  List<People> peopleList = peopleMapper.findAll();
  for (People people : peopleList) {
   System.out.println(people);
  }
  return peopleMapper.findAll();
 }

 public People findOne(Integer id){
  return peopleMapper.findOne(id);
 }
}
