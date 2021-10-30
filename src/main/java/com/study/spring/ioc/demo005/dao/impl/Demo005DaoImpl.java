package main.java.com.study.spring.ioc.demo005.dao.impl;

import main.java.com.study.spring.ioc.demo005.dao.Demo005Dao;
import main.java.com.study.spring.ioc.demo005.model.BO.Demo005Bo;

public class Demo005DaoImpl implements Demo005Dao {

    @Override
    public void demo005Dao001(Demo005Bo bo) {
        System.out.println("dao.....");
        System.out.println("内部bean注入测试：" + bo.toString());
    }
}
