package com.example.sqg.demo.config.a3;

import com.example.sqg.demo.config.a4.AccountInit;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @program: demo
 * @description:
 * @author: SQG
 * @create: 2021-10-15 15:58
 **/
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(beanName.equals("accountInit")) {
            AccountInit account = (AccountInit) bean;
            System.out.println("before---------------------"+account.getName());
            account.setName("before-action");
            return account;
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if(beanName.equals("accountInit")) {
            AccountInit account = (AccountInit) bean;
            System.out.println("after---------------------"+account.getName());
            account.setName("after-action");
            return account;
        }
        return bean;
    }
}
