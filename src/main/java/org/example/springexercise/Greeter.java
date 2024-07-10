package org.example.springexercise;

public class Greeter {
    private String name;

    public Greeter(String name) {
        this.name = name;
    }

    public void greet(String name) {
        System.out.println(String.format("Hello, %s", name));
    }

    public void greet() {
        System.out.println(String.format("Hello, %s", this.name));
    }

}
