package com.shiki.jvm.classloader;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: shiki
 * @date: 2019/10/24 下午2:46
 * @description: 类加载器主动使用与被动使用
 */
public class MyTest3 {
    public static void main(String[] args) {
        MyParent3[][] myParent1s = {{}};
        System.out.println("======");
        List<MyParent3> list = new ArrayList<>();
    }
}

class MyParent3 {
    public static final String  str = "hello world";

    static {
        System.out.println("MyParent3 static block");
    }

    public MyParent3() {
        System.out.println("MyParent Constructor");
    }
}

class MyChild3 extends MyParent3 {
    static {
        System.out.println("MyChild3 static block");
    }

    public MyChild3() {
        System.out.println("MyChild3 Constructor");
    }
}
