package com.pratice.Streams.Custom.Problem7;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee
{
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name,String department)
    {
        this.id=id;
        this.name=name;
        this.department=department;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = List.of
                (
                        new Employee(1, "A", "IT"),
                        new Employee(2, "B", "HR"),
                        new Employee(3, "C", "IT"),
                        new Employee(4, "D", "HR"),
                        new Employee(5, "E", "Sales")
                );

       Map<String,List<String>> map=  employeeList.stream().collect(
                Collectors.groupingBy(x->x.department
                        ,Collectors.mapping(x->x.name,Collectors.toList())
           ));

        System.out.println(map);


      }

    }
