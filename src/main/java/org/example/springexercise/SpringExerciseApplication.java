package org.example.springexercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringExerciseApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Greeter greeter = context.getBean(Greeter.class);

        greeter.greet();  // Should print "Hello, World"
        greeter.greet("Alice");  // Should print "Hello, Alice"
    }
}