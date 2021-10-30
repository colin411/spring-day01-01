package main.java.com.study.spring.aop.demo016.proxy;

import main.java.com.study.spring.aop.demo016.service.Demo016Interface;
import main.java.com.study.spring.aop.demo016.service.impl.Demo016InterfaceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author 周卓群
 * @title: JDKProxy
 * @projectName spring-day01-01
 * @description: TODO
 * @date 2021/10/3010:56
 */
public class JDKProxy {

    /**
    * @name: inhanceMethod
    * @description: TODO 功能增强实现方法
    * @params:
    null
    * @return:
    null
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/30-11:01
    */

    public static void inhanceMethod() {
        //    创建接口实现类代理对象
        Class[] interfaces = {Demo016Interface.class};

//        匿名内部类方法实现
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });

        Demo016Interface demo016Interface = new Demo016InterfaceImpl();

        Demo016Interface service = (Demo016Interface)Proxy
                .newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new Demo016Proxy(demo016Interface));

        int resNum = service.demoMethod001(1, 2);
        System.out.println("增强方法 demoMethod001 ：result = " + resNum);
    }
}

  /**
      * @title: JDKProxy
      * @description: TODO 创建代理对象实现代码
      * @author: 周卓群
      * @date: 2021/10/30 11:02
      * @version: 1.0
      */
class Demo016Proxy implements InvocationHandler {

//      创建的是谁的代理对象 就把谁传递过来
//      通过有参构造传递



    private Object obj;

    public Demo016Proxy(Object obj) {
      this.obj = obj;
    }


      /**
    * @name: invoke
    * @description: TODO 增强的逻辑
    * @params:

     * @param: proxy
     * @param: method
     * @param: args
    * @return:

     * @return: java.lang.Object
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/30-11:03
    */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        方法之前执行
        System.out.println("方法之前执行---->" + method.getName() + ":传递的参数--->" + Arrays.toString(args));

//        被增强的方法执行
        Object res = method.invoke(obj, args);

//        方法之后执行
        System.out.println("方法之前执行---->" + obj);

        return res;
    }
}
