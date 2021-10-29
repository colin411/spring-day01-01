package main.java.com.study.spring.demo009;

import org.springframework.beans.factory.FactoryBean;

public class FactoryBeanDemo implements FactoryBean<Demo009BO> {
    @Override
    public Demo009BO getObject() throws Exception {
        Demo009BO bo = new Demo009BO();
        bo.setParam("张三");
        return bo;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
