package com.geekster.EmployeeManagementSystem.Controller;

import com.geekster.EmployeeManagementSystem.Model.Employee;
import com.geekster.EmployeeManagementSystem.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmployee(){
        return employeeService.getAll();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@PathVariable Integer id, @RequestBody Employee employee){
        return employeeService.update(id, employee);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<String> remove(@PathVariable Integer id){
        return employeeService.remove(id);
    }

}
