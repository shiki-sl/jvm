package com.shiki.jvm.classloader;

/**
 * @author: shiki
 * @date: 2019/10/25 下午6:10
 * @description: My ClassLoader
 */
public class MyTest7 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> string = Class.forName("java.lang.String");
        System.out.println(string.getClassLoader());
    }
}
