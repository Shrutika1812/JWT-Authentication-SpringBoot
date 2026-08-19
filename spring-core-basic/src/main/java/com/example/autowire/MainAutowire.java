package com.example.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutowire {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("beans-autowire.xml");

        Employee e = (Employee) ctx.getBean("emp");
        e.show();
    }
}
