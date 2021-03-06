package test.java.com.study.spring.ioc;


import main.java.com.study.spring.ioc.demo009.Demo009BO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo009 {

    /**
     * 抽取数组
     */
    @Test
    public void testDemoMethod009() {
//        1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/ioc/bean-demo009.xml");

//        2.获取配置对象
        Demo009BO demo = context.getBean("factoryBeanDemo", Demo009BO.class);
        System.out.println(demo.toString());
    }

}
