package com.shiki.jvm.myclass;

/**
 * @author: shiki
 * @date: 2019/11/7 下午5:35
 * @description: 强制类型转化的字节码结构
 */
public class MyTest {
    public static void main(String[] args) {
        People p = new People();
        p.test();
        p = new Father();
        p.test();
        p = new Son();
        p.test();
        if (p instanceof Son) {
            ((Son) p).test(1);
        }
    }
}

class People {
    void test() {
        System.out.println("people");
    }
}

class Father extends People {
    @Override
    void test() {
        System.out.println("father");
    }
}

class Son extends Father {
    @Override
    void test() {
        System.out.println("son");
    }

    void test(int a) {
        System.out.println("son.test() overwrite");
    }
}