package com.geekster.EmployeeManagementSystem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employee_tbl")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Email")
    @Email(message = "Enter valid Employee Email")
    private String email;

    @Column(name = "Phone_Number")
    @Length(min = 10, max = 15, message = "Enter valid Number")
    private String phoneNumber;

    @Column(name = "Role")
    private String role;

    @Column(name = "Salary")
    private Integer salary;
}
