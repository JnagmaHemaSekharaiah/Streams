package com.pratice.Streams.Custom.Problem5;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee
{

    private  int id ;
    private String name;

    public Employee(int id,String name)
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
                        new Employee(3, "A"),
                        new Employee(4, "C"),
                        new Employee(5, "B")
                );


       Map<String,Long> map= employeeList.stream().collect(Collectors.groupingBy(
                x->x.name,Collectors.counting())
        );

      List<String> list =  map.entrySet().stream().filter(x->x.getValue()>1)
               .map(x->x.getKey()).toList();

        System.out.println(list);

    }



}
