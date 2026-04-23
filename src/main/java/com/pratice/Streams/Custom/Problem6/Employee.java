package com.pratice.Streams.Custom.Problem6;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee
{
    private int id;
    private String name;

    public Employee(int id, String name)
    {
        this.id=id;
        this.name=name;

    }


    public static void main(String[] args)
    {
        List<Employee> employeeList = List.of
                (
                        new Employee(1, "A"),
                        new Employee(2, "B"),
                        new Employee(3, "C")
                );

        Map<Integer,String> map=   employeeList.stream().collect
                (
                        Collectors.toMap(e->e.id, m->m.name,(v1,v2)->v2)
                );

        System.out.println(map);


    }

}
