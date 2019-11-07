package com.shiki.jvm.classloader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author: shiki
 * @date: 2019/10/24 下午2:46
 * @description: 类加载器主动使用与被动使用
 */
public class MyTest4 {
    public static void main(String[] args) {
        System.out.println(MyChild4.a);
    }
}
interface  Inf{

}
interface MyParent4 extends Inf{
}

interface MyChild4 extends MyParent4 {
    int  a = 1;
}
