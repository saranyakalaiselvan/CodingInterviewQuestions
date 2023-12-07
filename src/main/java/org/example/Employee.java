package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private Integer employeeId;
    private String employeeName;
    private String department;
    private Double salary;
}
