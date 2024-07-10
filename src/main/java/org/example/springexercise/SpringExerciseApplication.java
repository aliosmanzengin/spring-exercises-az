package org.example.springexercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringExerciseApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Greeter greeter1 = context.getBean(Greeter.class);

        greeter1.greet();  // Should print "Hello, World"

        Greeter greeter2 = context.getBean(Greeter.class);
        greeter2.greet("Ali");  // Should print "Hello, Alice"

        System.out.println(greeter1 == greeter2); //false, it will be true if Greeter class wont have //@Scope("prototype")

    }
}