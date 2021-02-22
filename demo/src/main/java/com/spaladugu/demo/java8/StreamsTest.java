package com.spaladugu.demo.java8;

import com.spaladugu.demo.models.Employee;
import com.spaladugu.demo.models.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {
    static List getStudentList() {
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student(1, "Ravi", "Male", 30);
        Student s2 = new Student(2, "Amy", "Female", 31);
        Student s3 = new Student(1, "Ram", "Male", 32);
        Student s4 = new Student(1, "Yara", "Female", 30);
        Student s5 = new Student(1, "Anudeep", "Male", 33);
        Student s6 = new Student(1, "Rajani", "Female", 38);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        studentList.add(s1);
        return studentList;
    }

    public static List<Employee> createListOfEmployees()
    {
        List<Employee> listOfEmployees=new ArrayList<>();
        Employee emp1= new Employee("Ankit","20",Arrays.asList("Delhi","Mumbai"));
        Employee emp2= new Employee("Shilpa","24",Arrays.asList("Kolkata","Pune"));
        Employee emp3= new Employee("Megha","20",Arrays.asList("Delhi","Patna"));
        Employee emp4= new Employee("Mohan","20",Arrays.asList("Banglore","Pune"));
        listOfEmployees.add(emp1);
        listOfEmployees.add(emp2);
        listOfEmployees.add(emp3);
        listOfEmployees.add(emp4);
        return listOfEmployees;
    }

    public static void main(String args[]) {
        System.out.println(getStudentList());
        List<Integer> intList = Arrays.asList(10, 20, 30, 40, 50);
        Object count = getStudentList().stream().collect(Collectors.counting());
        System.out.println(count);
        Object average = intList.stream().collect(Collectors.averagingInt(s -> s));
        System.out.println(average);
        Object average2 = intList.stream().collect(Collectors.averagingInt(s -> s * s));
        System.out.println(average2);

        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = listOfNumbers.stream().filter(s -> {
            System.out.println("inside filter -" + s);
            if (s % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }).map(s -> {
            System.out.println("inside map - " + s *2);
            return s * 2;
        }).reduce(0, (subtotal, element) -> {
            System.out.println("Inside reduce method - " + subtotal + "Elemnet - "+ element);
            return subtotal + element;
        });

        System.out.println(sum);
        List<Employee> listOfEmployees = createListOfEmployees();

        List<String> listOfCities=listOfEmployees.stream()
                .flatMap(e -> e.getListOfCities().stream())
                .collect(Collectors.toList());
        listOfCities.forEach(System.out::println);

    }
}
