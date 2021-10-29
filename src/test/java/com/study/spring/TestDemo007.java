package test.java.com.study.spring;


import main.java.com.study.spring.demo007.Demo007Collection;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo007 {

    /**
     * 注入数组
     */
    @Test
    public void testDemoMethod007() {
//        1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/bean-demo007.xml");

//        2.获取配置对象
        Demo007Collection demo = context.getBean("demo007Collection", Demo007Collection.class);
        demo.print();
    }

}
