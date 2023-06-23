package com.tasanah.designpatterncreational.builder;

import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void testBuilder() {
        Employee employee = Employee.builder()
                .id("XXX-XXX-XXX")
                .employeeId("00123")
                .employeeName("Yoga Hilmi Tasanah")
                .jobTitle("Backend Engineer")
                .build();

        System.out.println(employee);
    }
}