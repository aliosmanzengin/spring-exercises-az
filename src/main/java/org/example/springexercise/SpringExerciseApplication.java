package org.example.springexercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExerciseApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Greeter greeter = (Greeter) context.getBean("greeter");

        greeter.greet(); //should print hello world
        greeter.greet("Ali");
    }
}
