package test.java.com.study.spring;


import main.java.com.study.spring.demo003.Demo003;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo003 {

    /**
     * 使用构造方法注入属性
     */
    @Test
    public void testDemoMethod003() {
//        1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/bean-demo003.xml");

//        2.获取配置对象
        Demo003 demo = context.getBean("demo003", Demo003.class);
        System.out.println(demo.toString());

    }

}
