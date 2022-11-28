package com.ty.employeeapp.employeeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.employeeapp.employeeapp.dto.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{

}
