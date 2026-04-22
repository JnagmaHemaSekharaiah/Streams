package com.pratice.Streams.Custom.Problem2;

import java.util.List;

public class Employee {

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

    public static void main(String[] args) {

        List<Employee> employeeList = List.of
                (
                        new Employee(1, "A", "IT", 5000),
                        new Employee(2, "B", "HR", 7000),
                        new Employee(3, "C", "IT", 4000),
                        new Employee(4, "D", "HR", 6000),
                        new Employee(5, "E", "Sales", 3500)
                );


        System.out.println(
        employeeList.stream().filter(x->x.getSalary()>5000).map(x->x.name).toList()
        );




    }

}
