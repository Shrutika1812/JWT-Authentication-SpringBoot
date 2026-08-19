package com.example.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConstructor {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("beans-constructor.xml");

        Employee e = (Employee) ctx.getBean("emp");
        e.show();
    }
}
