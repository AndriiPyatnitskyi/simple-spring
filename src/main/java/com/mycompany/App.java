package com.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);
        Greeter greeter = context.getBean(Greeter.class);
        System.out.println(greeter.greet());
    }
}
