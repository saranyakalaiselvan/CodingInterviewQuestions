package org.example;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;

public class HighestSalaryEmployeeForEachDepartment {
    public static void main(String[] args) {

        Employee employee = new Employee(1, "A1", "HR", 200000.0);
        Employee employee1 = new Employee(2, "A2", "Developer", 300000.0);
        Employee employee3 = new Employee(3, "A3", "Developer", 310000.0);
        Employee employee4 = new Employee(4, "A4", "Tester", 200000.0);
        Employee employee5 = new Employee(5, "A1", "Lead", 350000.0);
        Employee employee6 = new Employee(6, "A6", "Tester", 2500000.0);
        Employee employee7 = new Employee(7, "A7", "Lead", 420000.0);
        Employee employee8 = new Employee(8, "A8", "HR", 2500000.0);
        Employee employee9 = new Employee(9, "A5", "Lead", 350000.0);

        List<Employee> employees = Arrays.asList(
                employee1, employee,  employee3, employee4,
                employee5, employee6, employee7,employee8, employee9);
        Map<String, Employee> highlySalariedEmployee = employees.stream()
                .collect(groupingBy(Employee::getDepartment, collectingAndThen(
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                        Optional::get
                )));
        System.out.println(highlySalariedEmployee);
    }
}

/*****
 * Group that employees by department
 * Compare teh salary of the employee in each department
 * Get the highest salaried employee for each department
 */