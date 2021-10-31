package main.java.com.study.spring.jdbctemplate.demo019.service;

import main.java.com.study.spring.jdbctemplate.demo019.entity.TableDemo001BO;

import java.util.List;

/**
 * @author 周卓群
 * @title: Demo019Service
 * @projectName spring-day01-01
 * @description: TODO jdbctemplate 创建
 * @date 2021/10/3020:59
 */

public interface Demo019Service {
    /**
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

    public boolean insert(TableDemo001BO bo);

    /**
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

    public boolean update(TableDemo001BO bo);

    /**
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

    public boolean delete(TableDemo001BO bo);

    /**
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

    public Integer findOne(String demo_row01);

    /**
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

    public TableDemo001BO findObject(String demo_row01);

    /**
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

    public List<TableDemo001BO> findList(String demo_row01);

    /**
    * @name: batchInsert
    * @description: TODO 批量添加
    * @params:

     * @param: objArrList
    * @return:
    null
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/31-13:20
    */


    public int[] batchInsert(List<Object[]> objArrList);

}
