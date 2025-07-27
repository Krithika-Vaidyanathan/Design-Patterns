package org.example.CompositeDesignPattern;

public class CompositePatternClient {
    public static void main(String[] args) {
        //Create leaf employees
        Developer dev1 = new Developer("Alice", "Frontend Developer");
        Developer dev2 = new Developer("Bob", "Backend Developer");
        Manager man1 = new Manager("Charlie", "QA Manager");
        Manager man2 = new Manager("Diana", "Dev Manager");

        //Create sub-directory (team)
        CompanyDirectory devTeam = new CompanyDirectory("Development team");
        devTeam.addEmployee(dev1);
        devTeam.addEmployee(dev2);
        devTeam.addEmployee(man2);

        //Create another sub-directory (QA team)
        CompanyDirectory qaTeam = new CompanyDirectory("QA team");
        qaTeam.addEmployee(man1);

        //Create main directory (department)
        CompanyDirectory mainDirectory = new CompanyDirectory("Head office");

        //Add teams(composites) and individual employees (leaf) to main directory
        mainDirectory.addEmployee(devTeam);
        mainDirectory.addEmployee(qaTeam);

        //Add an individual employee directly to main directory
        Developer dev3 = new Developer("Eve", "UI Designer");
        mainDirectory.addEmployee(dev3);

        //Show all employee details - this prints all composites and leaves
        mainDirectory.showEmployeeDetails();
    }
}
