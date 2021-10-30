package test.java.com.study.spring.aop;


import main.java.com.study.config.AoPDemoConfig002;
import main.java.com.study.config.SpringDemoConfig001;
import main.java.com.study.spring.aop.demo018.Demo018;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
    * @title: TestDemoConfigClass018
    * @description: TODO
    * @author: 周卓群
    * @date: 2021/10/30 13:54
    * @version: 1.0
    */
public class TestDemoConfigClass018 {



    /**
    * @name: testDemoConfigMethod018
    * @description: TODO 测试根据配置类进行Aop通知
    * @params:
    null
    * @return:
    null
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/30-14:39
    */

    @Test
    public void testDemoConfigMethod018() {
      ApplicationContext context = new AnnotationConfigApplicationContext(AoPDemoConfig002.class);

      Demo018 demo = context.getBean("demo018", Demo018.class);

      demo.demoMethod001();
    }

}
