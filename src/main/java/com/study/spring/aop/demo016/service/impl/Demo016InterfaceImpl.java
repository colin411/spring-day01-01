package main.java.com.study.spring.aop.demo016.service.impl;

import main.java.com.study.spring.aop.demo016.service.Demo016Interface;

/**
 * @author 周卓群
 * @title: Demo016InterfaceImpl
 * @projectName spring-day01-01
 * @description: TODO
 * @date 2021/10/3010:47
 */
public class Demo016InterfaceImpl implements Demo016Interface {

    @Override
    public int demoMethod001(int param01, int param02) {
        System.out.println("demoMethod001 执行--->");
        return param01 + param02;
    }

    @Override
    public int demoMethod002(int param01, int param02) {
        System.out.println("demoMethod002 执行--->");
        return param01 - param02;
    }
}
