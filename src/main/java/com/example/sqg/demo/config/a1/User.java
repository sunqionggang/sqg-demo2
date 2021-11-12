package com.example.sqg.demo.config.a1;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.FactoryBean;

@Data
@AllArgsConstructor
public class User implements FactoryBean {

    private int id;

    private String name;

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public Object getObject() throws Exception {
        return new User(1,"fbb");
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
    // setter // getter // constructor
}