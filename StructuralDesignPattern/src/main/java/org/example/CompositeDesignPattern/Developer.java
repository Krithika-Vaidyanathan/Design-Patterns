package org.example.CompositeDesignPattern;

//Step2: Leaf - Represents an individual employee with no children
public class Developer implements Employee {

    private String name;
    private String position;

    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(name + " works as " + position);
    }
}
