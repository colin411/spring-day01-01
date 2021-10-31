package main.java.com.study.spring.jdbctemplate.demo019.dao.impl;

import main.java.com.study.spring.jdbctemplate.demo019.dao.Demo019Dao;
import main.java.com.study.spring.jdbctemplate.demo019.entity.TableDemo001BO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 周卓群
 * @title: Demo019DaoImpl
 * @projectName spring-day01-01
 * @description: TODO
 * @date 2021/10/3021:03
 */
@Repository
public class Demo019DaoImpl implements Demo019Dao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean insert(TableDemo001BO bo) {
//        创建sql语句
        String sql = "insert into demo_table_001(demo_row01, demo_row02, demo_row03) values(?, ?, ?)";

        Object[] objects = {bo.getDemo_row01(), bo.getDemo_row02(), bo.getDemo_row03()};

        int res = jdbcTemplate.update(sql, objects);

        if (res > 0) {
            return true;
        }

        return false;
    }

    @Override
    public boolean update(TableDemo001BO bo) {
        //        创建sql语句
        String sql = "update demo_table_001 set demo_row02=? where demo_row01=?";

        Object[] objects = {bo.getDemo_row02(), bo.getDemo_row01()};
        System.out.println(bo.toString());

        int res = jdbcTemplate.update(sql, objects);

        if (res > 0) {
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(TableDemo001BO bo) {
        //        创建sql语句
        String sql = "delete from demo_table_001 where demo_row01=?";

        int res = jdbcTemplate.update(sql, bo.getDemo_row01());

        if (res > 0) {
            return true;
        }

        return false;
    }

    @Override
    public Integer findOne(String demo_row01) {
        String sql = "select count(*) from demo_table_001";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

    @Override
    public TableDemo001BO findObject(String demo_row01) {
        String sql = "select * from demo_table_001 where demo_row01=?";

        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<TableDemo001BO>(TableDemo001BO.class), demo_row01);
    }

    @Override
    public List<TableDemo001BO> findList(String demo_row01) {
        String sql = "select * from demo_table_001 where demo_row01=?";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<TableDemo001BO>(TableDemo001BO.class), demo_row01);
    }

    @Override
    public int[] batchInsert(List<Object[]> objArrList) {
        String sql = "insert into demo_table_001(demo_row01, demo_row02, demo_row03) values(?, ?, ?)";
        System.out.println("增加中...");
        return jdbcTemplate.batchUpdate(sql, objArrList);

    }

}
