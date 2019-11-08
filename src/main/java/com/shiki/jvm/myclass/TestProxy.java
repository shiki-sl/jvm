package com.shiki.jvm.myclass;

import java.lang.reflect.Proxy;

/**
 * @author: shiki
 * @date: 2019/11/7 下午7:41
 * @description: 动态代理的字节码
 */
public class TestProxy {
    public static void main(String[] args) {
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");
        Clazz clazz = new Clazz();
        InterFace i = (InterFace) Proxy.newProxyInstance(clazz.getClass().getClassLoader(), clazz.getClass().getInterfaces(), (proxy, method, args1) -> {
            System.out.println("before " + method);
            Object invoke = method.invoke(clazz, args1);
            System.out.println("after " + method);
            return invoke;
        });
        i.test();
    }
}

interface InterFace {
    void test();
}

class Clazz implements InterFace {
    @Override
    public void test() {
        System.out.println("Clazz");
    }
}