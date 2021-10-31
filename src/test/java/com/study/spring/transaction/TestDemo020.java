package test.java.com.study.spring.transaction;

import main.java.com.study.spring.transaction.demo020.service.Demo020Service;
import main.java.com.study.spring.transaction.demo020.service.impl.Demo020ServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

  /**
      * @title: TestDemo020
      * @description: TODO
      * @author: 周卓群
      * @date: 2021/10/31 13:49
      * @version: 1.0
      */
public class TestDemo020 {


    /**
    * @name: testDemoInsertMethod020
    * @description: TODO 事务处理
    * @params:
    null
    * @return:
    null
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/31-10:55
    */

    @Test
    public void testDemoInsertMethod020() {
//        1.加载spring配置类
        ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/transaction/bean-demo020.xml");
//        2.获取配置对象
        Demo020Service service = context.getBean("demo020ServiceImpl", Demo020Service.class);

        if(service.transfer())
            System.out.println("成功");
        else
            System.out.println("失败");
    }

}
