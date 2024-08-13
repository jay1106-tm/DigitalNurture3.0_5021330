package com.employee.EmployeeManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.employee.EmployeeManagementSystem.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //derived
    @Query(name = "Employee.findByEmail")
    List<Employee> findByEmail(@Param("name") String email);
}
