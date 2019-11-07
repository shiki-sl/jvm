package com.shiki.jvm.classloader;

/**
 * @author: shiki
 * @date: 2019/10/24 下午6:32
 * @description: 初始化类
 */
public class MyTest5 {
    public static void main(String[] args) {
        Singleton.getInstance();
        System.out.println(Singleton.a);
        System.out.println(Singleton.b);
    }
}

class Singleton {

    public static int a = 1;

    private static Singleton singleton = new Singleton();

    private Singleton() {
        a++;
        b++;
    }
    public static int b = 0;

    public static Singleton getInstance(){
        return singleton;
    }
}
