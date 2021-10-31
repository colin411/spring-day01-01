package test.java.com.study.spring.jdbctemplate;


import main.java.com.study.spring.jdbctemplate.demo019.entity.TableDemo001BO;
import main.java.com.study.spring.jdbctemplate.demo019.service.Demo019Service;
import main.java.com.study.spring.jdbctemplate.demo019.service.impl.Demo019ServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestDemo019 {


    /**
    * @name: testDemoInsertMethod019
    * @description: TODO 使用 jdbctemplate进行数据库数据插入
    * @params:
    null
    * @return:
    null
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/31-10:55
    */

    @Test
    public void testDemoInsertMethod019() {
//        1.加载spring配置类
        ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/jdbctemplate/bean-demo019.xml");
//        2.获取配置对象
        Demo019Service service = context.getBean("demo019ServiceImpl", Demo019ServiceImpl.class);

        TableDemo001BO tableDemo001BO = new TableDemo001BO();
        tableDemo001BO.setDemo_row01(10001);
        tableDemo001BO.setDemo_row02("李四");
        tableDemo001BO.setDemo_row03("男");

        boolean flag = service.insert(tableDemo001BO);

        System.out.println(flag);
    }

    /**
    * @name: testDemoUpdateMethod019
    * @description: TODO 使用 jdbctemplate进行数据库数据更新
    * @params:
    null
    * @return:
    null
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/31-10:56
    */

    @Test
    public void testDemoUpdateMethod019() {
//        1.加载spring配置类
        ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/jdbctemplate/bean-demo019.xml");
//        2.获取配置对象
        Demo019Service service = context.getBean("demo019ServiceImpl", Demo019ServiceImpl.class);

        TableDemo001BO tableDemo001BO = new TableDemo001BO();
        tableDemo001BO.setDemo_row01(10001);
        tableDemo001BO.setDemo_row02("abc");

        boolean flag = service.update(tableDemo001BO);

        System.out.println(flag);
    }

    /**
    * @name: testDemoDeleteMethod019
    * @description: TODO  使用 jdbctemplate进行数据库数据删除
    * @params:
    null
    * @return:
    null
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/31-10:58
    */

    @Test
    public void testDemoDeleteMethod019() {
//        1.加载spring配置类
        ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/jdbctemplate/bean-demo019.xml");
//        2.获取配置对象
        Demo019Service service = context.getBean("demo019ServiceImpl", Demo019ServiceImpl.class);

        TableDemo001BO tableDemo001BO = new TableDemo001BO();
        tableDemo001BO.setDemo_row01(10001);

        boolean flag = service.delete(tableDemo001BO);

        System.out.println(flag);
    }

    /**
    * @name: testDemoFindMethod019
    * @description: TODO 查询方法
    * @params:
    null
    * @return:
    null
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/31-11:29
    */

    @Test
    public void testDemoFindMethod019() {
//        1.加载spring配置类
        ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/jdbctemplate/bean-demo019.xml");
//        2.获取配置对象
        Demo019Service service = context.getBean("demo019ServiceImpl", Demo019ServiceImpl.class);

        TableDemo001BO tableDemo001BO = new TableDemo001BO();
        tableDemo001BO.setDemo_row01(10001);

        Integer resOne =  service.findOne("10001");
        TableDemo001BO resObj =  service.findObject("10001");
        List<TableDemo001BO> resList = service.findList("10002");

        System.out.println("resOne = "+ resOne);
        System.out.println("resObj = "+ resObj.toString());

        for (TableDemo001BO bo: resList) {
            System.out.println("resList = "+ bo.toString());
        }

    }

    /**
    * @name: testDemoBatchInsertMethod019
    * @description: TODO 批量添加
    * @params:
    null
    * @return:
    null
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/31-13:26
    */

    @Test
    public void testDemoBatchInsertMethod019() {
//        1.加载spring配置类
        ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/jdbctemplate/bean-demo019.xml");
//        2.获取配置对象
        Demo019Service service = context.getBean("demo019ServiceImpl", Demo019ServiceImpl.class);

        List<Object[]> ibjArrList = new ArrayList<>();
        Object[] obj1 = {10003, "q", "f"};
        Object[] obj2 = {10004, "w", "m"};
        Object[] obj3 = {10005, "e", "f"};
        Object[] obj4 = {10006, "r", "m"};

        ibjArrList.add(obj1);
        ibjArrList.add(obj2);
        ibjArrList.add(obj3);

        int[] resArr = service.batchInsert(ibjArrList);

        for (int res : resArr) {
            System.out.println("resNum = "+ res);
        }

        System.out.println("长度为：" + resArr.length);

    }

}
