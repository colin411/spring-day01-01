package test.java.com.study.spring;


import main.java.com.study.spring.demo007.Demo007Collection;
import main.java.com.study.spring.demo008.Demo008VO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo008 {

    /**
     * 抽取数组
     */
    @Test
    public void testDemoMethod008() {
//        1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/bean-demo008.xml");

//        2.获取配置对象
        Demo008VO demo = context.getBean("demo008VO", Demo008VO.class);
        demo.print();
    }

}
