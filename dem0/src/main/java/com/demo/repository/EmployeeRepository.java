package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
