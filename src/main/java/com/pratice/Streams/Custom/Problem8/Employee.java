package com.pratice.Streams.Custom.Problem8;

import java.util.Comparator;
import java.util.List;

public class Employee {


    private int id;
    private String name;
    private int salary;


    public Employee(int id, String name, int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }



    public static void main(String[] args) {
        List<Employee> employeeList = List.of
                (
                        new Employee(1, "A", 5000),
                        new Employee(2, "B", 7000),
                        new Employee(3, "C", 4000),
                        new Employee(4, "D", 6000),
                        new Employee(5, "E", 3500)
                );

        Comparator<Integer> comp = (a, b) ->
        {
            Integer x = a;
            Integer y = b;
            return y.compareTo(x);
        };


        Integer s = employeeList
                .stream()
                .map(x -> x.salary)
                .sorted(comp)
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(s);


    }

}
