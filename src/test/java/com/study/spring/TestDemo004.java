package test.java.com.study.spring;


import main.java.com.study.spring.demo004.service.Demo004service;
import main.java.com.study.spring.demo004.service.impl.Demo004ServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo004 {

    /**
     * 外部Bean的注入
     */
    @Test
    public void testDemoMethod004() {
//        1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/bean-demo004.xml");

//        2.获取配置对象
        Demo004service demo = context.getBean("service", Demo004ServiceImpl.class);
        demo.demo004Interface001();
    }

}
