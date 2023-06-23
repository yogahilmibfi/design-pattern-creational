package com.tasanah.designpatterncreational.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = SingletonApplication.class)
class SingletonApplicationTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void testSingleton() {

        var counter1 = context.getBean(Singleton.class);
        var counter2 = context.getBean(Singleton.class);
        var counter3 = context.getBean(Singleton.class);

        Singleton singleton = new Singleton();


        counter1.increment();
        counter2.increment();
        counter3.increment();

        System.out.println(counter1.getCounter());
        System.out.println(counter2.getCounter());
        System.out.println(counter3.getCounter());

    }
}