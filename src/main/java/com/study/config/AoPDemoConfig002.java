package main.java.com.study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 周卓群
 * @title: AoPDemoConfig002
 * @projectName spring-day01-01
 * @description: TODO 取消配置文件 直接使用注解方式实现
 * @date 2021/10/3014:35
 */
@Configuration
@ComponentScan(basePackages = "main.java.com.study.spring.aop.demo018")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AoPDemoConfig002 {
}
