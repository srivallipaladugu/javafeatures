package com.spaladugu.demo.java8;

import com.spaladugu.demo.models.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    static List<Employee> employeeList;

    public static void main(String args[]) {
        employeeList = new ArrayList<Employee>();
        Employee e1 = new Employee("Britany", "35");
        Employee e2 = new Employee("ram", "34");
        Employee e3 = new Employee("Ajay", "31");
        Employee e4 = new Employee("vijay", "32");
        Employee e5 = new Employee("sateesh", "33");
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        System.out.println("Before sorting" + employeeList);
        Collections.sort(employeeList);
        System.out.println("After sorting with comparable" + employeeList);
        employeeList.sort(new EmployeeComparator());
        System.out.println("After sorting" + employeeList);
        Collections.sort(employeeList, (ee1, ee2) -> ee2.getAge().compareTo(ee1.getAge()));
        System.out.println("After sorting descending order using lamda expressions" + employeeList);
        Collections.sort(employeeList, Comparator.comparing(Employee::getName));
        System.out.println("After sorting descending order using method reference" + employeeList);
        Collections.sort(employeeList, Comparator.comparing(Employee::getName).reversed());
        System.out.println("After sorting descending order using method reference reverse" + employeeList);
    }
}
