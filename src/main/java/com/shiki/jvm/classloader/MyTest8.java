package com.shiki.jvm.classloader;

/**
 * @author: shiki
 * @date: 2019/10/25 下午6:18
 * @description: class loader
 */
public class MyTest8 {
    public static void main(String[] args) {
        System.out.println(FinalTest.x);
    }
}

class FinalTest {
    public static final int x = 3;

    static {
        System.out.println("----------");
    }
}
