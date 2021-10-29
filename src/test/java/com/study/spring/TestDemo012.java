package test.java.com.study.spring;


import com.alibaba.druid.pool.DruidDataSource;
import main.java.com.study.spring.demo011.Demo011VO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo012 {

    /**
     * 引入外部属性文件
     */
    @Test
    public void testDemoMethod012() {
//        1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("main/resourse/bean-demo012.xml");

//        2.获取配置对象
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource.getUrl());
    }

}
