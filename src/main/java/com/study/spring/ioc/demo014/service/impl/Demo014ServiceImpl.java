package main.java.com.study.spring.ioc.demo014.service.impl;

import main.java.com.study.spring.ioc.demo014.dao.Demo014Dao;
import main.java.com.study.spring.ioc.demo014.service.Demo014Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

  /**
      * @title: Demo014ServiceImpl
      * @description: TODO
      * @author: 周卓群
      * @date: 2021/10/30 10:01
      * @version: 1.0
      */
@Service
public class Demo014ServiceImpl implements Demo014Service {

//    @Resource
//    @Resource(name = "")
  @Autowired
  @Qualifier(value = "daotest")//要和autowired一起使用  当接口有多个实现类时使用
  private Demo014Dao dao;

  @Override
  public void print() {
    dao.print();
  }

}
