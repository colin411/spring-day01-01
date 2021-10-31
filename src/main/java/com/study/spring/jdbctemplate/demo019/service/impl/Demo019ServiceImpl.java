package main.java.com.study.spring.jdbctemplate.demo019.service.impl;

import main.java.com.study.spring.jdbctemplate.demo019.dao.Demo019Dao;
import main.java.com.study.spring.jdbctemplate.demo019.entity.TableDemo001BO;
import main.java.com.study.spring.jdbctemplate.demo019.service.Demo019Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 周卓群
 * @title: Demo019ServiceImpl
 * @projectName spring-day01-01
 * @description: TODO
 * @date 2021/10/3021:02
 */
@Service
public class Demo019ServiceImpl implements Demo019Service {

    @Autowired
    private Demo019Dao dao;

    /**
     * @param bo
     * @name: insert
     * @description: TODO 新增数据
     * @params:
     * @param: bo
     * @return:
     * @return: boolean
     * @throws: null
     * @author: 周卓群
     * @date: 2021/10/30-21:26
     */
    @Override
    public boolean insert(TableDemo001BO bo) {
        boolean flag = dao.insert(bo);
        return flag;
    }

    /**
     * @param bo
     * @name: update
     * @description: TODO 修改数据
     * @params:
     * @param: bo
     * @return:
     * @return: boolean
     * @throws: null
     * @author: 周卓群
     * @date: 2021/10/30-21:26
     */
    @Override
    public boolean update(TableDemo001BO bo) {
        boolean flag = dao.update(bo);
        return flag;
    }


    /**
     * @param bo
     * @name: delete
     * @description: TODO 删除数据
     * @params:
     * @param: row001
     * @return:
     * @return: boolean
     * @throws: null
     * @author: 周卓群
     * @date: 2021/10/30-21:27
     */
    @Override
    public boolean delete(TableDemo001BO bo) {
        boolean flag = dao.delete(bo);
        return flag;
    }

    /**
     * @param demo_row01
     * @name: findOne
     * @description: TODO 查找一个值
     * @params:
     * @param: demo_row01
     * @return:
     * @return: java.lang.Integer
     * @throws: null
     * @author: 周卓群
     * @date: 2021/10/31-11:19
     */
    @Override
    public Integer findOne(String demo_row01) {
        return dao.findOne(demo_row01);
    }

    /**
     * @param demo_row01
     * @name: findObject
     * @description: TODO 查找一个对象
     * @params:
     * @param: demo_row01
     * @return:
     * @return: main.java.com.study.spring.jdbctemplate.demo019.entity.TableDemo001BO
     * @throws: null
     * @author: 周卓群
     * @date: 2021/10/31-11:20
     */
    @Override
    public TableDemo001BO findObject(String demo_row01) {
        return dao.findObject(demo_row01);
    }

    /**
     * @param demo_row01
     * @name: findList
     * @description: TODO 查找多个对象
     * @params:
     * @param: demo_row01
     * @return:
     * @return: main.java.com.study.spring.jdbctemplate.demo019.entity.TableDemo001BO
     * @throws: null
     * @author: 周卓群
     * @date: 2021/10/31-11:20
     */
    @Override
    public List<TableDemo001BO> findList(String demo_row01) {
        return dao.findList(demo_row01);
    }

    /**
     * @param objArrList
     * @name: batchInsert
     * @description: TODO 批量添加
     * @params: null
     * @return: null
     * @throws: null
     * @author: 周卓群
     * @date: 2021/10/31-13:15
     */
    @Override
    public int[] batchInsert(List<Object[]> objArrList) {
        return dao.batchInsert(objArrList);
    }


}
