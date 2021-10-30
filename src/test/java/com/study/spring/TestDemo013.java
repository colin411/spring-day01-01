package test.java.com.study.spring;


import com.alibaba.druid.pool.DruidDataSource;
import main.java.com.study.spring.demo013.service.Demo013Service;
import main.java.com.study.spring.demo013.service.impl.Demo013ServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo013 {

    /**
    * @name: testDemoMethod012
    * @description: TODO 基于注解实现对象创建
    * @params:
    null
    * @return:
    null
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/30-8:31
    */

    @Test
    public void testDemoMethod012() {
//        1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/bean-demo013.xml");

//        2.获取配置对象
        Demo013Service service = context.getBean("demo013ServiceImpl", Demo013ServiceImpl.class);
        service.print();
    }

}
