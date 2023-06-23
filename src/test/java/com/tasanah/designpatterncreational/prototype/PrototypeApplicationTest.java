package com.tasanah.designpatterncreational.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = PrototypeApplication.class)
class PrototypeApplicationTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void testPrototype() {
        Incentive yoga = context.getBean("incentiveHeto", Incentive.class);
        yoga.setName("Yoga");

        Incentive hilmi = context.getBean("incentiveMachinery", Incentive.class);
        hilmi.setName("Hilmi");

        Incentive tasanah = context.getBean("incentiveMe", Incentive.class);
        tasanah.setName("Tasanah");

        System.out.println(yoga);
        System.out.println(hilmi);
        System.out.println(tasanah);
    }
}