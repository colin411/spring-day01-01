package main.java.com.study.spring.transaction.demo020.dao.impl;

import main.java.com.study.spring.transaction.demo020.dao.Demo020Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


/**
 * @author 周卓群
 * @title: Impl
 * @projectName spring-day01-01
 * @description: TODO
 * @date 2021/10/3113:35
 */
@Repository
public class Demo020DaoImpl implements Demo020Dao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public boolean reduceMoney() {

        String sql = "update t_account set money=money-? where name='lucy'";

        int res = jdbcTemplate.update(sql, 100);

        if (res > 0) return true;

        return false;
    }

    @Override
    public boolean addMoney() {

        String sql = "update t_account set money=money+? where name='mary'";

        int res = jdbcTemplate.update(sql, 100);

        if (res > 0) return true;

        return false;
    }
}
