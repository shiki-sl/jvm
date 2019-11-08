package com.shiki.jvm.classloader;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author: shiki
 * @date: 2019/11/8 下午1:18
 * @description: mysql驱动使用标准SPI存在MATE-INF下的加载
 */
public class MyTest24 {
    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shiki", "root", "123456");
        System.out.println(connection.getMetaData());
    }
}
