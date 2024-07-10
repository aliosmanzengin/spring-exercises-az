package org.example.springexercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Greeter {
    private GreetingFormatter formatter;
    private String name;

    @Autowired
    public Greeter(GreetingFormatter formatter) {
        this.formatter = formatter;
    }

    @Value("${name:World}") //injects the value from application.properties or default value passed
    public void setName(String name) {
        this.name = name;
    }


    public void greet(String name) {
        System.out.println(formatter.format(name));
    }

    public void greet() {
        System.out.println(formatter.format(this.name));
    }

}
