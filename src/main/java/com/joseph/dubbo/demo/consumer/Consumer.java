package com.joseph.dubbo.demo.consumer;

import com.joseph.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dys09435 on 2017/10/12.
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        String message = demoService.sysHello("Joseph");
        System.out.println(message);
    }
}
