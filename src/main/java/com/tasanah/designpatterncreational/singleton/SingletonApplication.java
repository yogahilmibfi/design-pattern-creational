package com.tasanah.designpatterncreational.singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SingletonApplication {

    @Bean
    public Singleton singleton() {
        return new Singleton();
    }
}
