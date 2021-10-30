package main.java.com.study.spring.aop.demo018;

import org.springframework.stereotype.Component;

/**
 * @author 周卓群
 * @title: Demo018  基于AspectJ 实现配置文件配置 实现不同的通知
 * @projectName spring-day01-01
 * @description: TODO
 * @date 2021/10/3013:42
 */
@Component
public class Demo018 {

    public void demoMethod001() {
//        手动发生一个异常  当出现异常时 AfterThrowing注解工作
//        int a = 10/0;
        System.out.println("原方法----->");
    }
}
