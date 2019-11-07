package com.shiki.jvm.classloader;

/**
 * @author: shiki
 * @date: 2019/11/3 下午3:49
 * @description: 类加载器的类加载器
 */
public class MyTest23 {
    public static void main(String[] args) {
        ClassLoader classLoader = MyTest23.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getClass().getClassLoader());
    }
}
