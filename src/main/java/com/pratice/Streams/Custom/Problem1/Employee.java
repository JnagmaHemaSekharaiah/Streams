package com.pratice.Streams.Custom.Problem1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee
{

    private int id;
    private String name;
    private String department;
    private int salary;

   public  Employee(int id, String name, String department,int salary)
    {
        this.id=id;
        this.name=name;
        this.department= department;
        this.salary=salary;
    }


    public static void main(String[] args) {

       List<Employee> employeeList = List.of
               (
        new Employee(1, "A", "IT",5000),
        new Employee(2, "B", "HR",7000),
        new Employee(3, "C", "IT",4000),
        new Employee(4, "D", "HR",6000),
        new Employee(5, "E", "Sales",3500)
       );

     Map map1=  employeeList.stream().collect(Collectors.groupingBy
             (x->x.department,Collectors.mapping(x->x.name,Collectors.toList())) );

     System.out.println(map1);

     Map map2=  employeeList.stream().collect(Collectors.groupingBy
                (x->x.department,Collectors.mapping(x->x,Collectors.counting())) );

     System.out.println(map2);

        Comparator<Integer> cmp = (x,y)->
        {
          Integer a =(Integer) x;
          Integer b= (Integer) y;
          return a.compareTo(b);
        };

    Map map3  =  employeeList.stream().collect(Collectors.groupingBy
                (x->x.department,Collectors.mapping(x->x.salary,
                        Collectors.maxBy(cmp
                ))));

    System.out.println(map3);



   }

}



