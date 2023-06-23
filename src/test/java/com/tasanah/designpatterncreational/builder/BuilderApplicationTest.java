package com.tasanah.designpatterncreational.builder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest(classes = BuilderApplication.class)
class BuilderApplicationTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void testBuilderPrototype() {
        Employee employee = context.getBean("backend", Employee.class);
        employee.setEmployeeName("Yoga Hilmi Tasanah");
        employee.setJobTitle("Backend Engineer");

        System.out.println(employee);
    }
}