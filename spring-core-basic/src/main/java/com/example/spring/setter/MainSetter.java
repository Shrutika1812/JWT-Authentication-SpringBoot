package com.example.spring.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSetter {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("beans-setter.xml");

        Employee e = (Employee) ctx.getBean("emp");
        e.show();
    }
}
