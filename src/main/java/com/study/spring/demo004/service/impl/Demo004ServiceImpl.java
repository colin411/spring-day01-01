package main.java.com.study.spring.demo004.service.impl;

import main.java.com.study.spring.demo004.dao.Demo004Dao;
import main.java.com.study.spring.demo004.service.Demo004service;

public class Demo004ServiceImpl implements Demo004service {

    private Demo004Dao dao;

    public Demo004Dao getDao() {
        return dao;
    }

    public void setDao(Demo004Dao dao) {
        this.dao = dao;
    }

    @Override
    public void demo004Interface001() {
        System.out.println("service.....");
        dao.demo004Dao001();
    }
}
