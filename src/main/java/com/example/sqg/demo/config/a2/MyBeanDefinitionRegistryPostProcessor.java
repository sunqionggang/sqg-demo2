package com.example.sqg.demo.config.a2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * @program: demo
 * @description: test
 * @author: SQG
 * @create: 2021-10-15 15:40
 **/
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        // 第一次从所有befinition中找不到student
        //System.out.println(beanDefinitionRegistry.getBeanDefinition("fbb"));
        // 创造student的beandefinition
        BeanDefinitionHolder holder = createBeanDefinition(Student.class.getName());
        // 注册
        BeanDefinitionReaderUtils.registerBeanDefinition(holder, beanDefinitionRegistry);
        // 此时有了
        System.out.println(beanDefinitionRegistry.getBeanDefinition("student"));
    }

    // 生产student的beandefinition
    private BeanDefinitionHolder createBeanDefinition(String className) {
        BeanDefinitionBuilder definition = BeanDefinitionBuilder.genericBeanDefinition(Student.class);
        definition.addPropertyValue("name", "ffbbb");
        return new BeanDefinitionHolder(definition.getBeanDefinition(), "student");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
}
