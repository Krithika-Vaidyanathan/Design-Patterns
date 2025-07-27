package org.example.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

//Step3: Composite - Represents directory that can hold multiple employee objects (leaves or other composites).
public class CompanyDirectory implements Employee {
    private List<Employee> employeeList = new ArrayList<>();
    private String directoryName;

    public CompanyDirectory(String directoryName) {
        this.directoryName = directoryName;
    }
    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }
    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Directory: " + directoryName);
        for(Employee emp: employeeList) {
            emp.showEmployeeDetails();
        }
    }
}
