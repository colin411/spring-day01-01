package test.java.com.study.spring.ioc;


import main.java.com.study.spring.ioc.demo005.model.BO.Demo005Bo;
import main.java.com.study.spring.ioc.demo005.service.Demo005service;
import main.java.com.study.spring.ioc.demo005.service.impl.Demo005ServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo005 {

    /**
     * 内部Bean的注入
     */
    @Test
    public void testDemoMethod005() {
//        1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/ioc/bean-demo005.xml");

//        2.获取配置对象
        Demo005Bo bo = context.getBean("demo005Bo", Demo005Bo.class);
        System.out.println(bo.toString());

        Demo005service demo = context.getBean("service", Demo005ServiceImpl.class);
        demo.demo005Interface001(bo);
    }

}
