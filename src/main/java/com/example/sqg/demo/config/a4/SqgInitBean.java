package com.example.sqg.demo.config.a4;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @program: demo
 * @description: test
 * @author: SQG
 * @create: 2021-10-15 15:18
 **/
public class SqgInitBean implements InitializingBean , DisposableBean {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public SqgInitBean(String name){
        this.name=name;
    }

    @Override
    public void afterPropertiesSet() {
        this.setName("init-bean");
    }

    @Override
    public void destroy() {
        System.out.println("exit...##############################################");
    }
}
