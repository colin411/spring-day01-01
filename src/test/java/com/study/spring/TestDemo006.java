package test.java.com.study.spring;


import main.java.com.study.spring.demo005.model.BO.Demo005Bo;
import main.java.com.study.spring.demo005.service.Demo005service;
import main.java.com.study.spring.demo005.service.impl.Demo005ServiceImpl;
import main.java.com.study.spring.demo006.collection.Demo006;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo006 {

    /**
     * 注入数组
     */
    @Test
    public void testDemoMethod006() {
//        1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/bean-demo006.xml");

//        2.获取配置对象
        Demo006 demo = context.getBean("demo006", Demo006.class);
        demo.print();
    }

}
