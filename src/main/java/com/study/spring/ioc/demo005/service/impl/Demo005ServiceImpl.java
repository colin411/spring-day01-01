package main.java.com.study.spring.ioc.demo005.service.impl;

import main.java.com.study.spring.ioc.demo005.dao.Demo005Dao;
import main.java.com.study.spring.ioc.demo005.model.BO.Demo005Bo;
import main.java.com.study.spring.ioc.demo005.service.Demo005service;

public class Demo005ServiceImpl implements Demo005service {

    private Demo005Dao dao;

    public Demo005Dao getDao() {
        return dao;
    }

    public void setDao(Demo005Dao dao) {
        this.dao = dao;
    }

    @Override
    public void demo005Interface001(Demo005Bo bo) {
        System.out.println("service.....");
        dao.demo005Dao001(bo);
    }
}
