package com.shiki.jvm.classloader;

import java.io.*;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Enumeration;

/**
 * @author: shiki
 * @date: 2019/10/29 上午11:32
 * @description: ClassLoader
 */
public class MyTest16 extends ClassLoader {
    private String classLoaderName;
    private final String fileExtension = ".class";
    private String path = "";

    public MyTest16(String classLoaderName) {
        this.classLoaderName = classLoaderName;
    }

    public MyTest16(ClassLoader parent, String classLoaderName) {
        super(parent);
        this.classLoaderName = classLoaderName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public Class<?> findClass(String className) {
        System.out.println("myFindClass");
        byte[] data = loadClassData(className);
        return super.defineClass(className, data, 0, data.length);
    }

    private byte[] loadClassData(String className) {
        byte[] data = null;
        try (InputStream in = new FileInputStream(new File(path + className.replace(".", "/")) + fileExtension);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            int ch;
            while ((ch = in.read()) != -1) {
                baos.write(ch);
            }
            data = baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    @Override
    public String toString() {
        return "[" + classLoaderName + "]";
    }

    public static void main(String[] args) throws Exception {
        MyTest16 classLoader = new MyTest16("myClassLoader");
        MyTest16 classLoader2 = new MyTest16("myClassLoader2");
        classLoader.setPath("/home/shiki/code/java/code/myClassLoader/");
        classLoader2.setPath("/home/shiki/code/java/code/myClassLoader/");
        Class<?> clazz = classLoader.loadClass("com.shiki.jvm.classloader.MyTest7");
        Class<?> clazz2 = classLoader2.loadClass("com.shiki.jvm.classloader.MyTest7");
        Object o = clazz.getConstructor().newInstance();
        Object o2 = clazz2.getConstructor().newInstance();
        System.out.println(clazz.getClassLoader());
        System.out.println(clazz2.getClassLoader());
    }

}
