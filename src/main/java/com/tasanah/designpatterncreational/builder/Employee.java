package com.tasanah.designpatterncreational.builder;

import lombok.Builder;

@Builder
public class Employee {

    private String id;

    private String employeeId;

    private String employeeName;

    private String jobTitle;

    private WorkingUnit workingUnit;


    public Employee(String id, String employeeId, String employeeName, String jobTitle, WorkingUnit workingUnit) {
        this.id = id;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.jobTitle = jobTitle;
        this.workingUnit = workingUnit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public WorkingUnit getWorkingUnit() {
        return workingUnit;
    }

    public void setWorkingUnit(WorkingUnit workingUnit) {
        this.workingUnit = workingUnit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", jobTitle=" + jobTitle +
                ", workingUnit=" + workingUnit +
                '}';
    }
}
