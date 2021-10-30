package main.java.com.study.spring.demo014.dao.impl;

import main.java.com.study.spring.demo014.dao.Demo014Dao;
import main.java.com.study.spring.demo014.service.Demo014Service;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

  /**
      * @title: Demo014DaoImpl
      * @description: TODO
      * @author: 周卓群
      * @date: 2021/10/30 9:17
      * @version: 1.0
      */
  @Repository(value = "daotest")
public class Demo014DaoImpl implements Demo014Dao {


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
      System.out.println("Autowired......");
    }
  }
