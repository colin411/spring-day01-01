package main.java.com.study.spring.ioc.demo014.dao.impl;

import main.java.com.study.spring.ioc.demo014.dao.Demo014Dao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
      * @title: Demo014DaoImpl
      * @description: TODO 基于注解注入属性和自动装配
      * @author: 周卓群
      * @date: 2021/10/30 9:17
      * @version: 1.0
      */
@Repository(value = "daotest")
public class Demo014DaoImpl implements Demo014Dao {
    /**
     * 基于注解注入属性
       */
    @Value(value = "Autowired......")
    private String param;

    /**
     * @name: print
     * @description: TODO
     * @params: null
     * @return: null
     * @throws: null
     * @author: 周卓群
     * @date: 2021/10/30-9:20
     */
    @Override
    public void print() {
      System.out.println(this.param);
    }
  }
