package org.example.springexercise;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.example.springexercise")
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Value("${name:World}") //Inject the value from application.properties or defaults to "World"
    private String name;

    @Bean
    public Greeter greeter() {
        return Greeter.getInstance(name);
    }
}
