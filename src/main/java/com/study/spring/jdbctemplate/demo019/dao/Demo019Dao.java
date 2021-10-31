package main.java.com.study.spring.jdbctemplate.demo019.dao;

import main.java.com.study.spring.jdbctemplate.demo019.entity.TableDemo001BO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 周卓群
 * @title: Demo019Dao
 * @projectName spring-day01-01
 * @description: TODO jdbctemplate 创建
 * @date 2021/10/3020:59
 */

public interface Demo019Dao {

    boolean insert(TableDemo001BO bo);

    boolean update(TableDemo001BO bo);

    boolean delete(TableDemo001BO bo);

    Integer findOne(String demo_row01);

    TableDemo001BO findObject(String demo_row01);

    List<TableDemo001BO> findList(String demo_row01);

    int[] batchInsert(List<Object[]> objArrList);
}
