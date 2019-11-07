package com.shiki.jvm.classloader;

/**
 * @author: shiki
 * @date: 2019/10/24 下午2:46
 * @description: 类加载器主动使用与被动使用
 */
public class MyTest1 {
    public static void main(String[] args) {
        System.out.println(MyChild1.str);
    }
}

class MyParent1 {
    public static String str = "hello world";

    static {
        System.out.println("MyParent1 static block");
    }

    public MyParent1() {
        System.out.println("MyParent Constructor");
    }
}

class MyChild1 extends MyParent1 {
    static {
        System.out.println("MyChild1 static block");
    }

    public MyChild1() {
        System.out.println("MyChild1 Constructor");
    }
}
