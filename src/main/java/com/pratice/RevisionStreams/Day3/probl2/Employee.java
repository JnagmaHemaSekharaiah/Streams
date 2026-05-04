package com.pratice.RevisionStreams.Day3.probl2;

import java.util.*;
import java.util.stream.Collectors;

public class Employee
{
    int id;
    String name;
    String dept;
    int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    Employee(int id, String name, String dept, int salary)
    {
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.salary=salary;
    }

    public static void main(String[] args)
    {
        List<Employee> Emplist = Arrays.asList
                (
                        new Employee(1,"sekhar","IT",12000),
                        new Employee(2,"Ravi","AI",31000),
                        new Employee(3,"Virat","ML",14000),
                        new Employee(4,"Rohit","AI",5000),
                        new Employee(5,"Ranga","IT",3200),
                        new Employee(3,"Rabo","IT",4000),
                        new Employee(4,"Rohit","ML",5000)
                );



         List<String> listname = Emplist.stream().map(x->x.name).toList();

         



    }
}
