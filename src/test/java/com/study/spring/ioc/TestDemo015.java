package test.java.com.study.spring.ioc;


import main.java.com.study.config.SpringDemoConfig001;
import main.java.com.study.spring.ioc.demo015.service.Demo015Service;
import main.java.com.study.spring.ioc.demo015.service.impl.Demo015ServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDemo015 {


    /**
    * @name: testDemoMethod015
    * @description: TODO 基于配置类 完全注解开发
    * @params:
    null
    * @return:
    null
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/30-10:03
    */

    @Test
    public void testDemoMethod015() {
//        1.加载spring配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringDemoConfig001.class);

//        2.获取配置对象
        Demo015Service service = context.getBean("demo015ServiceImpl", Demo015ServiceImpl.class);
        service.print();
    }

}
