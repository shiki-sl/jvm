package com.shiki.jvm.classloader;

/**
 * @author: shiki
 * @date: 2019/10/24 下午2:46
 * @description: 类加载器主动使用与被动使用
 */
public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(MyChild2.str);
    }
}

class MyParent2 {
    public static final String  str = "hello world";

    static {
        System.out.println("MyParent1 static block");
    }

    public MyParent2() {
        System.out.println("MyParent Constructor");
    }
}

class MyChild2 extends MyParent2 {
    static {
        System.out.println("MyChild1 static block");
    }

    public MyChild2() {
        System.out.println("MyChild1 Constructor");
    }
}
