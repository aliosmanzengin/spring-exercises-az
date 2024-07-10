package org.example.springexercise;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Greeter implements InitializingBean {

    @Value("${title}")
    private String title;

    @Value("${name}")
    private String name;

    private GreetingFormatter formatter;
    private String fullName;

    @Autowired
    public void setFormatter(GreetingFormatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.fullName = title + name;
    }

    public void greet(String name) {
        System.out.println(formatter.format(name));
    }

    public void greet() {
        System.out.println(formatter.format(this.fullName));
    }

}
