package com.joseph.dubbo.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Joseph on 2017/10/12.
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]
            {"META-INF/spring/dubbo-demo-provider.xml"});
        context.start();
        System.in.read();
    }
}
