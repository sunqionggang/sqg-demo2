package com.example.sqg.demo;

import com.example.sqg.demo.config.a4.AccountInit;
import com.example.sqg.demo.config.a4.SqgInitBean;
import com.example.sqg.demo.config.a1.User;
import com.example.sqg.demo.config.a2.MyBeanDefinitionRegistryPostProcessor;
import com.example.sqg.demo.config.a3.Account;
import com.example.sqg.demo.config.a3.MyBeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class DemoApplication {

    @Bean
    @Scope("singleton")
    public SqgInitBean getSqgBean(){
        return new SqgInitBean("ss");
    }

    @Bean
    public User user(){
        return new User(100,"bbf");
    }


    @Bean
    public MyBeanDefinitionRegistryPostProcessor bfProcessor(){
        return new MyBeanDefinitionRegistryPostProcessor();
    }

    @Bean
    public MyBeanPostProcessor beanPostProcessor(){
        return new MyBeanPostProcessor();
    }

    @Bean
    public Account account(){
        return new Account("fff");
    }

    @Bean
    public AccountInit accountInit(){
        return new AccountInit("init");
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
