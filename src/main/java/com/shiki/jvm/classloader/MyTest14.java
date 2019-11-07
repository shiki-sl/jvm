package com.shiki.jvm.classloader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @author: shiki
 * @date: 2019/10/29 上午11:32
 * @description: ClassLoader
 */
public class MyTest14 {
    public static void main(String[] args) throws IOException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        String resourceName = "com/shiki/jvm/classloader/MyClassLoader.class";
        Enumeration<URL> urls = contextClassLoader.getResources(resourceName);
        while (urls.hasMoreElements()) {
            System.out.println(urls.nextElement());
        }
    }
}

class MyClassLoader {
    static {
        System.out.println("MyClassLoader");
    }
}
