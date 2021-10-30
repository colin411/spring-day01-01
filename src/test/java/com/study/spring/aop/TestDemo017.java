package test.java.com.study.spring.aop;


import main.java.com.study.spring.aop.demo017.Demo017;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

  /**
      * @title: TestDemo017
      * @description: TODO
      * @author: 周卓群
      * @date: 2021/10/30 13:54
      * @version: 1.0
      */
public class TestDemo017 {


  /**
  * @name: testDemoMethod017
  * @description: TODO
  * @params:
  null
  * @return:
  null
  * @throws: null
  * @author: 周卓群
  * @date: 2021/10/30-13:52
  */

  @Test
  public void testDemoMethod017() {
    //        1.加载spring配置文件
    ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/aop/bean-demo017.xml");
//        BeanFactory
//        2.获取配置对象
    Demo017 demo = context.getBean("demo017", Demo017.class);
    demo.demoMethod001();
  }

}
