package com.pratice.Streams.Basic.IntermediateOp.flatmap.problem5;

import java.util.List;

public class Employee {


    private String name;
    private List<String> skills;

    public Employee(String name, List<String>  skillsL)
    {
        this.name=name;
        this.skills=skillsL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee("A",List.of("Java", "SQL")),
                new Employee("B",List.of("Python", "Java")),
                new Employee("c", List.of("Go"))

        );

        System.out.println(employeeList.stream()
                .flatMap(e->e.getSkills().stream()).toList());
    }

}
