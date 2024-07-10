package org.example.springexercise;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Greeter {
    private String name;

    private Greeter(String name) {
        this.name = name;
    }

    public static Greeter getInstance(String name) {
        return new Greeter(name);
    }

    public void greet(String name) {
        System.out.println(String.format("Hello, %s", name));
    }

    public void greet() {
        System.out.println(String.format("Hello, %s", this.name));
    }

}
