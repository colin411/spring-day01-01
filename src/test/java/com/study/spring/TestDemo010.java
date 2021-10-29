package test.java.com.study.spring;


import main.java.com.study.spring.demo009.Demo009BO;
import main.java.com.study.spring.demo010.DemoBeanOrders;
import org.junit.Test;
import org.omg.CORBA.CODESET_INCOMPATIBLE;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo010 {

    /**
     * bean的生命周期
     */
    @Test
    public void testDemoMethod010() {
//        1.加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/bean-demo010.xml");

//        2.获取配置对象
        DemoBeanOrders demo = context.getBean("demoBeanOrders", DemoBeanOrders.class);
        System.out.println(demo.toString());
        System.out.println("4.bean可以使用，可以获取到对象！");
//          手动销毁bean实例
        context.close();
    }

}
