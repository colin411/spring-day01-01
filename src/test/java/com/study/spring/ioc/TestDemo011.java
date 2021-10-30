package test.java.com.study.spring.ioc;


import main.java.com.study.spring.ioc.demo011.Demo011VO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo011 {

    /**
     * 实现自动装配
     */
    @Test
    public void testDemoMethod011() {
//        1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/ioc/bean-demo011.xml");

//        2.获取配置对象
        Demo011VO demo = context.getBean("demo011VO", Demo011VO.class);
        System.out.println(demo.toString());
    }

}
