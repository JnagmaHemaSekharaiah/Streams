package com.pratice.Streams.Custom.Problem9;

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

    public static void main(String[] args)
    {
        List<Employee> employeeList = List.of
                (
                        new Employee(1, "Anil", "IT"),
                        new Employee(2, "Aman", "HR"),
                        new Employee(3, "Bob", "IT"),
                        new Employee(4, "Ajay", "HR"),
                        new Employee(5, "David", "Sales")
                );

    Map<String,Long> map=  employeeList.stream().collect(
                 Collectors.groupingBy(
                 x->x.department,
                         Collectors.mapping(k->k.name
                                 ,Collectors.filtering(fil->fil.charAt(0)=='A',
                                         Collectors.counting()
                                 )
                         ))
    );

        System.out.println(map);


    }

}
