package main.java.com.study.spring.aop.demo016.service;

/**
 * @author 周卓群
 * @title: Demo016Interface
 * @projectName spring-day01-01
 * @description: TODO AOP 动态代理接口情况 使用jdk动态代理 创建实现类 调用 proxy 调用 newProxyInstance(p1, p2, p3)
 *                  方法有3个参数：
 *                      1. 类加载器
 *                      2. 增强方法所在的类，这个类实现的接口， 支持多个接口
 *                      3. 实现这个接口的InvocationHander，创建代理对象。写增强部分。
 * @date 2021/10/3010:46
 */
public interface Demo016Interface {

    /**
    * @name: demoMethod001
    * @description: TODO
    * @params:

     * @param: param01
     * @param: param02
    * @return:

     * @return: int
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/30-10:52
    */

    public int demoMethod001(int param01, int param02);

    /**
    * @name: demoMethod002
    * @description: TODO
    * @params:

     * @param: param01
     * @param: param02
    * @return:

     * @return: int
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/30-10:53
    */

    public int demoMethod002(int param01, int param02);
}
