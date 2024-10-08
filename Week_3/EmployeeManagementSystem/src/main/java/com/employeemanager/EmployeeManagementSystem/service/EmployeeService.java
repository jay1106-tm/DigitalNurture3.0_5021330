package com.employeemanager.EmployeeManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employeemanager.EmployeeManagementSystem.dto.EmployeeDTO;
import com.employeemanager.EmployeeManagementSystem.entity.Employee;
import com.employeemanager.EmployeeManagementSystem.projections.EmployeeProjection;
import com.employeemanager.EmployeeManagementSystem.repository.EmployeeRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.NonNull;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PersistenceContext
    private EntityManager entityManager;
   
    @NonNull
    public Page<EmployeeDTO> getAllEmployees(Pageable pageable){
        return employeeRepository.findAllEmployees(pageable);
    }
    
    public EmployeeProjection getEmpById(Long id){
        return employeeRepository.findEmpById(id);
    }
    public List<EmployeeProjection> findByEmail(String email){
        return employeeRepository.findByEmail(email);
    }
    public List<EmployeeProjection> findByName(String name){
        return employeeRepository.findByName(name);
    }
    
    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id).orElse(null);
    }
    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    @Transactional
    public void batchInsert(List<Employee> employees) {
        int batchSize = 30;
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee.getId() == null) {
                
                entityManager.persist(employee);
            } else {
                
                entityManager.merge(employee);
            }
            if (i % batchSize == 0 && i > 0) {
                
                entityManager.flush();
                entityManager.clear();
            }
        }

        entityManager.flush();
        entityManager.clear();
    }
}
