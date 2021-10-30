package main.java.com.study.spring.ioc.demo015.service.impl;

import main.java.com.study.spring.ioc.demo015.dao.Demo015Dao;
import main.java.com.study.spring.ioc.demo015.service.Demo015Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

  /**
      * @title: Demo015ServiceImpl
      * @description: TODO
      * @author: 周卓群
      * @date: 2021/10/30 9:49
      * @version: 1.0
      */
@Service
public class Demo015ServiceImpl implements Demo015Service {


    @Autowired
    private Demo015Dao dao;

    @Override
    public void print() {
      dao.print();
    }

}
