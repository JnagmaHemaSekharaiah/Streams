package com.pratice.RevisionStreams.Day2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee2
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

     Employee2(int id, String name, String dept, int salary)
    {
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.salary=salary;
    }
    public static void main(String[] args)
    {
        List<Employee2> Emplist = Arrays.asList(
                new Employee2(1,"sekhar","IT",12000),
                new Employee2(2,"Ravi","AI",31000),
                new Employee2(3,"Virat","ML",14000),
                new Employee2(4,"Rohit","AI",5000),
                new Employee2(5,"Ranga","IT",3200),
                new Employee2(3,"Rabo","IT",4000),
                new Employee2(4,"Rahul","ML",5000)
        );

        Map<String,List<Employee2>> map= Emplist.stream().
                 collect(
                         Collectors.groupingBy
                         (x->x.dept,
                Collectors.toList())
                 );

        Comparator<Integer> comp = (Integer a, Integer b) ->
        {
           Integer sal1 = a;
           Integer sal2 = b;

           if (sal1<sal2)
           {
           return 1;
           }
           else if (sal1>sal2)
           {
           return -1;
           }
           return 0;
        };

        for (Map.Entry<String,List<Employee2>> li :map.entrySet())
        {
            System.out.println(
                    li.getKey()+" -> "+
                    li.getValue().stream().map(x->x.salary).sorted(comp).limit(1).toList()
            );
        }



    }
}
