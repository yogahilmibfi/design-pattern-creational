package com.tasanah.designpatterncreational.builder;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class BuilderApplication {


    @Bean
    @Scope("prototype")
    public Employee backend() {
        return Employee.builder().workingUnit(WorkingUnit.BACKEND).build();
    }

    @Bean
    @Scope("prototype")
    public Employee frontend() {
        return Employee.builder().workingUnit(WorkingUnit.FRONTEND).build();
    }




}
