package main.java.com.study.spring.ioc.demo015.dao.impl;

import main.java.com.study.spring.ioc.demo015.dao.Demo015Dao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
      * @title: Demo015DaoImpl
      * @description: TODO
      * @author: 周卓群
      * @date: 2021/10/30 9:17
      * @version: 1.0
      */
@Repository
public class Demo015DaoImpl implements Demo015Dao {
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
