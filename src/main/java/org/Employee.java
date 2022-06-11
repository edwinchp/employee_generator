package org;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private static int counter = 1;
    private String name;
    private String lastName;
    private String email;
    private static List<Employee> employees = new ArrayList<>();

    public Employee(String name, String lastName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.id = counter++;
    }

    public String toString() {
        return this.email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static List<Employee> getEmployees() {
        return employees;
    }

    public static void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public int getId() {
        return id;
    }
}
