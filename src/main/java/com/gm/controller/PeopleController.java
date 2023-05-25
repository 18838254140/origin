package com.gm.controller;

import com.gm.pojo.People;
import com.gm.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: gm
 * @createTime 2023/5/25 20:38
 * @description:
 */

@RestController
public class PeopleController {

 @Autowired
 PeopleService peopleService;

 @RequestMapping("/findAll")
 public List<People> findAll(){
  return peopleService.findAll();
 }

 public People findOne(Integer id){
  return peopleService.findOne(id);
 }
}
