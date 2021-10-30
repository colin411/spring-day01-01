package test.java.com.study.spring.ioc;


import main.java.com.study.spring.ioc.demo014.service.Demo014Service;
import main.java.com.study.spring.ioc.demo014.service.impl.Demo014ServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo014 {


    /**
    * @name: testDemoMethod014
    * @description: TODO 基于注解注入属性和自动装配
    * @params:
    null
    * @return:
    null
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/30-9:41
    */


    @Test
    public void testDemoMethod014() {
//        1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/ioc/bean-demo014.xml");

//        2.获取配置对象
        Demo014Service service = context.getBean("demo014ServiceImpl", Demo014ServiceImpl.class);
        service.print();
    }

}
