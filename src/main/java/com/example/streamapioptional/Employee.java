package com.example.streamapioptional;

public class Employee {
    private Integer department;
    private Integer salary;
    public Employee( Integer department, Integer salary) {
        this.department = department;
        this.salary = salary;
        }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department=" + department +
                ", salary=" + salary +
                '}';
    }
}
