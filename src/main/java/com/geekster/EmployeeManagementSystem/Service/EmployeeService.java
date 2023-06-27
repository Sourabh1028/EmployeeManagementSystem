package com.geekster.EmployeeManagementSystem.Service;

import com.geekster.EmployeeManagementSystem.Model.Employee;
import com.geekster.EmployeeManagementSystem.Repositary.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public ResponseEntity<String> addEmployee(Employee employee) {
        employee.setSalary(-1);
        employee.setRole("");
        employeeRepo.save(employee);
        return new ResponseEntity<>("Sucessfully Created..!!", HttpStatus.CREATED);
    }

    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }

    public ResponseEntity<String> update(Integer id, Employee employee) {
        employee.setSalary(-1);
        employee.setRole("");
        if(!employeeRepo.findById(id).isPresent()){
            return new ResponseEntity<>("Employee record dosent exist..!", HttpStatus.NOT_FOUND);
        }

        Employee employee1=employeeRepo.findById(id).get();
        if(employee.getEmail() != null){
            employee1.setEmail(employee.getEmail());
        }
        if(employee.getRole() != null){
            employee1.setRole(employee.getRole());
        }
        if(employee.getSalary() != null){
            employee1.setSalary(employee.getSalary());
        }
        if(employee.getFirstName() != null){
            employee1.setFirstName(employee.getFirstName());
        }
        if(employee.getLastName() != null) {
            employee1.setLastName(employee.getLastName());
        }

        employeeRepo.save(employee1);
        return new ResponseEntity<>("Employee updated..!", HttpStatus.OK);
    }

    public ResponseEntity<String> remove(Integer id) {
        if(employeeRepo.findById(id).isPresent()){
            employeeRepo.deleteById(id);
            return new ResponseEntity<>("Removed...!!", HttpStatus.OK);
        }
        return new ResponseEntity<>("Employee Not Found...!!", HttpStatus.BAD_REQUEST);
    }
}
