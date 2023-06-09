package com.demo.controller;

import com.demo.exception.ResourceNotFoundException;
import com.demo.model.Employee;
import com.demo.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    //get employees
    @GetMapping("/api/v1/employees")
    public List<Employee> getAllEmployee() {
        return this.employeeRepository.findAll();
    }

//    //get employee by id
//    @GetMapping("/employees/{id}")
//    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
//            throws ResourceNotFoundException {
//        Employee employee = employeeRepository.findById(employeeId)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id:: " + employeeId));
//        return ResponseEntity.ok().body(employee);
//
//    }
//
//    //save /add employee
//    @PostMapping("/employees")
//    public Employee createEmployee(@RequestBody Employee employee) {
//        return this.employeeRepository.save(employee);
//
//    }
//
//    //update employee
//    @PutMapping("/employees/{id}")
//    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
//                                                    @RequestBody Employee employeeDetails)
//            throws ResourceNotFoundException {
//        Employee employee = employeeRepository.findById(employeeId)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id:: " + employeeId));
//        employee.setEmail(employeeDetails.getEmail());
//        employee.setFirstName(employeeDetails.getFirstName());
//        employee.setLastname(employeeDetails.getLastname());
//        return ResponseEntity.ok(this.employeeRepository.save(employee));
//    }
//
//    //delete employee
//    @DeleteMapping("/employee/{id}")
//
//    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
//            throws ResourceNotFoundException {
//        Employee employee = employeeRepository.findById(employeeId)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id:: " + employeeId));
//        this.employeeRepository.delete(employee);
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("deleted", Boolean.TRUE);
//        return response;
//    }


}
