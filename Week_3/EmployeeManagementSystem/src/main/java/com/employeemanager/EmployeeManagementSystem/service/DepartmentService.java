package com.employeemanager.EmployeeManagementSystem.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanager.EmployeeManagementSystem.dto.DepartmentDTO;
import com.employeemanager.EmployeeManagementSystem.dto.EmployeeDTO;
import com.employeemanager.EmployeeManagementSystem.entity.Department;
import com.employeemanager.EmployeeManagementSystem.entity.Employee;
import com.employeemanager.EmployeeManagementSystem.projections.DepartmentProjection;
import com.employeemanager.EmployeeManagementSystem.repository.DepartmentRepository;
import com.employeemanager.EmployeeManagementSystem.repository.EmployeeRepository;


@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<DepartmentProjection> getAllDepartments(){
        return departmentRepository.findAllDepartments();
    }
    public DepartmentProjection getDeptById(Long id){
        return departmentRepository.findDepartmentById(id);
    }
    
    public DepartmentDTO getDepartmentByName(String name){
        DepartmentProjection dp= departmentRepository.findDepartmentByName(name);
        if(dp==null)
            return null;
        List<Employee> employees=employeeRepository.findByDepartmentId(dp.getId());
        List<EmployeeDTO> employeeDTOs=employees.stream().map(e->new EmployeeDTO(e.getId(),e.getName(),null,null)).collect(Collectors.toList());
        return new DepartmentDTO(dp.getId(), dp.getName(), dp.getEmployeeCount(),employeeDTOs);
    }
    
    public Department getDepartmentById(Long id){
        return departmentRepository.findById(id).orElse(null);
    }
    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }
    public void deleteDepartment(Long id){
        departmentRepository.deleteById(id);
    }
}

