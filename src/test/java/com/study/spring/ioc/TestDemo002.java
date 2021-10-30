package test.java.com.study.spring.ioc;


import main.java.com.study.spring.ioc.demo002.Demo002;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo002 {

    /**
     * 测试使用bean注入属性
     */
    @Test
    public void testDemoMethod002() {
//        1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/ioc/bean-demo002.xml");

//        2.获取配置对象
        Demo002 demo = context.getBean("demo002", Demo002.class);
        System.out.println(demo.toString());

    }

}
