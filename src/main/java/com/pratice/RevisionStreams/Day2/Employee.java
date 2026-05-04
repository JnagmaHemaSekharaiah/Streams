package com.pratice.RevisionStreams.Day2;

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
        List<Employee> Emplist = Arrays.asList(
                new Employee(1,"sekhar","IT",2000),
                new Employee(1,"sekhar","AI",3000),
                new Employee(1,"sekhar","IT",4000),
                new Employee(1,"sekhar","AI",5000),
                new Employee(1,"sekhar","IT",3200));




      Map<String, Optional<Employee>> op = Emplist.stream().collect(Collectors.groupingBy(
                Employee::getDept,
                (Collectors.maxBy(Comparator.comparing(Employee::getSalary))))
        );

      op.forEach(
              (dept,emp) ->
                      System.out.println(dept+"->"+emp)
              );



    }


}
