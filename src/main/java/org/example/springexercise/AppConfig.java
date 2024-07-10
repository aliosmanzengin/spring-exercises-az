package org.example.springexercise;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.example.springexercise")
@PropertySource("classpath:application.properties")
public class AppConfig {
    // Configuration class
}
