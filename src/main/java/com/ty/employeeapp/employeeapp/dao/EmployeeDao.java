package com.ty.employeeapp.employeeapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.employeeapp.employeeapp.dto.Employee;
import com.ty.employeeapp.employeeapp.repo.EmployeeRepo;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepo employeeRepo;
	
	public Employee saveEmployee(Employee employee)
	{
		return employeeRepo.save(employee);
	}
	
	public Employee getEmployee(int id)
	{
		return employeeRepo.findById(id).get();
		
	}
	
	public void deleteEmployee(int id)
	{
		employeeRepo.deleteById(id);
	}

}
