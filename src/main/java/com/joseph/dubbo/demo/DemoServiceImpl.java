package com.joseph.dubbo.demo;

/**
 * Created by Joseph on 2017/10/12.
 */
public class DemoServiceImpl implements DemoService {
    public String sysHello(String message) {
        return "Hello " + message;
    }
}
