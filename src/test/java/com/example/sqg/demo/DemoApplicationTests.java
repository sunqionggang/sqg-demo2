package com.example.sqg.demo;

import com.example.sqg.demo.config.a4.AccountInit;
import com.example.sqg.demo.config.a4.SqgInitBean;
import com.example.sqg.demo.config.a1.User;
import com.example.sqg.demo.config.a3.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private User user;

    @Test
    public void tt(){
        System.out.println(user.getName());
    }


    @Autowired
    SqgInitBean sqgInitBean;

    @Test
    public void tt2(){
        System.out.println(sqgInitBean.getName());
    }

    @Autowired
    private Account account;

    @Test
    public void tt3(){
        System.out.println(account.getName());
    }


    @Autowired
    private AccountInit accountInit;

    @Test
    public void tt4(){
        System.out.println(accountInit.getName());
    }

}
