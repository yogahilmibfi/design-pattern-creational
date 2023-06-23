package com.tasanah.designpatterncreational.prototype;

public class Incentive {

    private String id;
    private String name;
    private JobTitle jobTitle;
    private Long incentiveAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Long getIncentiveAmount() {
        return incentiveAmount;
    }

    public void setIncentiveAmount(Long incentiveAmount) {
        this.incentiveAmount = incentiveAmount;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", position=" + jobTitle +
                ", incentiveAmount=" + incentiveAmount +
                '}';
    }
}
