package test.java.com.study.spring.ioc;

import main.java.com.study.spring.ioc.demo001.Demo001;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo001 {

    @Test
    public void testDemoMethod001() {
//        1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/ioc/bean-demo001.xml");
//        BeanFactory
//        2.获取配置对象
        Demo001 demo = context.getBean("demo001", Demo001.class);
        System.out.println(demo);
        demo.demoMethod001();
    }

}
