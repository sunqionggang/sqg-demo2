package com.example.sqg.demo.config.a1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description:
 * @author: SQG
 * @create: 2021-11-12 08:46
 **/
@RestController
public class TestRestController {
    @GetMapping("hello")
    public String test(){
        return "myyyyyyy";
    }
}
