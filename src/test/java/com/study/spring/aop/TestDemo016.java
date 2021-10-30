package test.java.com.study.spring.aop;


import main.java.com.study.spring.aop.demo016.proxy.JDKProxy;
import org.junit.Test;
  /**
      * @title: TestDemo016
      * @description: TODO 测试demo016
      * @author: 周卓群
      * @date: 2021/10/30 11:21
      * @version: 1.0
      */
public class TestDemo016 {


    /**
    * @name: testDemoMethod015
    * @description: TODO AOP 有接口的方式 基于JDK动态代理 实现功能增强
    * @params:
    null
    * @return:
    null
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/30-10:03
    */

    @Test
    public void testDemoMethod016() {
        JDKProxy.inhanceMethod();
    }

}
