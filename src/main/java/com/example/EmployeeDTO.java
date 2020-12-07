package com.example;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class EmployeeDTO {

    private Integer employeeId;
    private String employeeName;
    private String departmentCode;

    public EmployeeDTO(Integer employeeId, String employeeName, String departmentCode) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.departmentCode = departmentCode;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
}
