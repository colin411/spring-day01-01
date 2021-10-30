package main.java.com.study.spring.aop.demo017;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

  /**
      * @title: Demo017PreProxy
      * @description: TODO 增强的类 当有多个增强的类时 可以设置优先顺序
      * @author: 周卓群
      * @date: 2021/10/30 14:18
      * @version: 1.0
      */
@Component
@Aspect //增强注解 生成代理对象
@Order(1) //增强类的执行顺序
public class Demo017PreProxy {

    /**
    * @name: pointcut
    * @description: TODO 相同切入点抽取 将相同的切入点进行整合
    * @params:
    null
    * @return:
    null
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/30-14:15
    */

    @Pointcut(value = "execution(* main.java.com.study.spring.aop.demo017.Demo017.demoMethod001(..))")
    public void pointcut() {

    }

    /**
    * @name: before
    * @description: TODO 前置通知 @Before 注解作为表示作为前置通知 方法之前执行
    * @params:
    null
    * @return:
    null
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/30-13:50
    */

    @Before(value = "execution(* main.java.com.study.spring.aop.demo017.Demo017.demoMethod001(..))") //切入点表达式
    public void before() {
        System.out.println("Pre-before---->");
    }

    /**
    * @name: after
    * @description: TODO 后置通知 @After  注解作为表示作为最终通知 返回值之后执行
    * @params:
    null
    * @return:
    null
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/30-13:59
    */

    @After(value = "pointcut()")
    public void after() {
        System.out.println("Pre-After---->");
    }

    /**
    * @name: afterReturning
    * @description: TODO @AfterReturning 注解作为表示作为后置通知 方法之后执行
    * @params:
    null
    * @return:
    null
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/30-14:00
    */

    @AfterReturning(value = "execution(* main.java.com.study.spring.aop.demo017.Demo017.demoMethod001(..))")
    public void afterReturning() {
        System.out.println("Pre-AfterReturning---->");
    }

    /**
    * @name: afterThrowing
    * @description: TODO @AfterThrowing 注解作为表示作为异常通知 出现一场之后执行通知
    * @params:
    null
    * @return:
    null
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/30-14:01
    */

    @AfterThrowing(value = "execution(* main.java.com.study.spring.aop.demo017.Demo017.demoMethod001(..))")
    public void afterThrowing() {
        System.out.println("Pre-AfterThrowing---->");
    }

    /**
    * @name: around
    * @description: TODO @Around 注解作为表示作为环绕通知 方法之前之后都执行
    * @params:
    null
    * @return:
    null
    * @throws: null
    * @author: 周卓群
    * @date: 2021/10/30-14:03
    */

    @Around(value = "execution(* main.java.com.study.spring.aop.demo017.Demo017.demoMethod001(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Pre-Before Around---->");

        proceedingJoinPoint.proceed();

        System.out.println("Pre-After Around---->");
    }
}
