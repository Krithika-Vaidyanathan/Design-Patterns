package org.example.CompositeDesignPattern;

//Step2: Leaf2 - Represents another type of individual employee
public class Manager implements Employee {

    private String name;
    private String position;

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(name + " works as " + position);
    }
}
