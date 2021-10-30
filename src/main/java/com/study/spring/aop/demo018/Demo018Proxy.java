package main.java.com.study.spring.aop.demo018;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 周卓群
 * @title: Demo018
 * Proxy
 * @projectName spring-day01-01
 * @description: TODO 增强的类 利用配置文件
 * @date 2021/10/3013:43
 */
public class Demo018Proxy {


    public void before() {
        System.out.println("before---->");
    }

    public void after() {
        System.out.println("After---->");
    }

    public void afterReturning() {
        System.out.println("AfterReturning---->");
    }

    public void afterThrowing() {
        System.out.println("AfterThrowing---->");
    }

    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Before Around---->");

        proceedingJoinPoint.proceed();

        System.out.println("After Around---->");
    }
}
