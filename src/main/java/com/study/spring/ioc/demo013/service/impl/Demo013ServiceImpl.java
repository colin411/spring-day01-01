package main.java.com.study.spring.ioc.demo013.service.impl;

import main.java.com.study.spring.ioc.demo013.service.Demo013Service;
import org.springframework.stereotype.Service;

/**
      * @title: Demo013ServiceImpl
      * @projectName: 基于注解实现对象创建
      * @description: TODO
      * @author 周卓群
      * @date 2021/10/30 7:41
      */
@Service
public class Demo013ServiceImpl implements Demo013Service {


    @Override
    public void print() {
        System.out.println("scaning.........");
    }
}
