package com.tasanah.designpatterncreational.prototype;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class PrototypeApplication {

    @Bean
    @Scope("prototype")
    public Incentive incentiveHeto() {
        var incentive = new Incentive();
        incentive.setJobTitle(JobTitle.HETO);
        incentive.setIncentiveAmount(1_000_000L);
        return incentive;
    }

    @Bean
    @Scope("prototype")
    public Incentive incentiveMachinery() {
        var incentive = new Incentive();
        incentive.setJobTitle(JobTitle.MACHINERY);
        incentive.setIncentiveAmount(1_500_000L);
        return incentive;
    }

    @Bean
    @Scope("prototype")
    public Incentive incentiveMe() {
        var incentive = new Incentive();
        incentive.setJobTitle(JobTitle.ME);
        incentive.setIncentiveAmount(2_000_000L);
        return incentive;
    }

    @Bean
    @Scope("prototype")
    public Incentive incentiveCme() {
        var incentive = new Incentive();
        incentive.setJobTitle(JobTitle.CME);
        incentive.setIncentiveAmount(2_500_000L);
        return incentive;
    }
}
