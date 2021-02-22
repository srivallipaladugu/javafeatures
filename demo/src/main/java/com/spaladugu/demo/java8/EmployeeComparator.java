package com.spaladugu.demo.java8;

import com.spaladugu.demo.models.Employee;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override public int compare(Employee o1, Employee o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
