package main.java.com.study.spring.transaction.demo020.service.impl;

import main.java.com.study.spring.transaction.demo020.dao.Demo020Dao;
import main.java.com.study.spring.transaction.demo020.service.Demo020Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 周卓群
 * @title: Demo020ServiceImpl
 * @projectName spring-day01-01
 * @description: TODO
 * @date 2021/10/3113:34
 */
@Service
@Transactional(readOnly = true, timeout = -1, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
public class Demo020ServiceImpl implements Demo020Service {

    @Autowired
    private Demo020Dao dao;


    /**
     * @name: transfer
     * @description: TODO 转账操作 @Transactional 可以加在类上面或方法上 添加到类 类中所有方法都加上了事务
     *                                          propagation:事务传播行为 多事务方法直接进行调用这个过程时
     *                                          ioslation：事务隔离级别+
     *                                          readonly： 是否只读
     *                                          rollbackfor：回滚
     *                                          norollbackfor：不回滚
     *
     *                                          事务方法：对数据库中表的数据进行变化的操作
     * @params: null
     * @return:
     * @return: boolean
     * @throws: null
     * @author: 周卓群
     * @date: 2021/10/31-13:44
     */
    @Override
    public boolean transfer() {
//        lucy减少100元
        Boolean flagLucy = dao.reduceMoney();

//        出现异常
        int a = 10/0;

//        mary增加100元
        Boolean flagMary = dao.addMoney();

        if (flagLucy && flagMary) {
            return true;
        }

        return false;
    }
}
