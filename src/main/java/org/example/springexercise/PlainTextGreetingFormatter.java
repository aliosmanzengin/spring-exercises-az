package org.example.springexercise;

import org.springframework.stereotype.Component;

@Component
public class PlainTextGreetingFormatter implements GreetingFormatter {

    @Override
    public String format(String name) {
        return String.format("Hello, %s", name);
    }
}
