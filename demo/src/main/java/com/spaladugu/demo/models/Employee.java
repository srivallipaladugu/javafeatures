package com.spaladugu.demo.models;

import java.util.List;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String name;
    private String age;

    public Employee(String name, String age, List<String> listOfCities) {
        this.name = name;
        this.age = age;
        this.listOfCities = listOfCities;
    }

    List<String> listOfCities;

    @Override public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", listOfCities=" + listOfCities +
                '}';
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(age, employee.age) &&
                Objects.equals(listOfCities, employee.listOfCities);
    }

    public List<String> getListOfCities() {
        return listOfCities;
    }

    public void setListOfCities(List<String> listOfCities) {
        this.listOfCities = listOfCities;
    }

    @Override public int hashCode() {
        return Objects.hash(name, age, listOfCities);
    }

    public Employee(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override public int compareTo(Employee e) {
        return this.getName().compareTo(e.getName());
    }
}
