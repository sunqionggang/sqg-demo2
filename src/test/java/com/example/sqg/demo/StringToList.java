package com.example.sqg.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: demo
 * @description: 测试string to lIst
 * @author: SQG
 * @create: 2021-10-28 10:38
 **/
public class StringToList {
    public static void main(String[] args) {
        String[] strings = {"123","2333"};
        List<String> rs =  new ArrayList<>();
        Collections.addAll(rs,strings);
        System.out.print(rs);
    }
}
