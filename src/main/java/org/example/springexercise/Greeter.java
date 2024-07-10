package org.example.springexercise;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Greeter {
    private String name;

    public Greeter() {

    }

    public Greeter(String name) {
        this.name = name;
    }

    @Value("${name:World}") // Injects the value from application.properties or defaults to "World"
    public void setName(String name) {
        this.name= name;
    }

    public void greet(String name) {
        System.out.println(String.format("Hello, %s", name));
    }

    public void greet() {
        System.out.println(String.format("Hello, %s", this.name));
    }

}
