package com.example.sqg.demo.config.a4;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

/**
 * @program: demo
 * @description:
 * @author: SQG
 * @create: 2021-10-15 16:00
 **/
@Data
@AllArgsConstructor
public class AccountInit implements InitializingBean {
    private String name;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init-bean");
        this.setName("acc-init-bean");
    }
}
