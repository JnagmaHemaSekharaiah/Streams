package com.pratice.Streams.Custom.Problem3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee
{
    private int id;
    private String name;
    private String department;
    private int salary;

    public Employee(int id, String name, String department, int salary)
    {
        this.id=id;
        this.name=name;
        this.department= department;
        this.salary=salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getSalary() { return salary; }

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args)
    {
        List<Employee> employeeList = List.of
                (
                        new Employee(1, "A", "IT", 5000),
                        new Employee(2, "B", "HR", 7000),
                        new Employee(3, "C", "IT", 4000),
                        new Employee(4, "D", "HR", 6000),
                        new Employee(5, "E", "Sales", 3500)
                );


        Comparator<Employee> comp = (a,b) ->
        {
              Integer x =  a.getSalary();
              Integer y =  b.getSalary();
              return  y.compareTo(x);
        };

      List<Employee> emp =    employeeList.stream().sorted(comp).collect(Collectors.toList());

      emp.forEach(x-> System.out.println(x));







    }

}
