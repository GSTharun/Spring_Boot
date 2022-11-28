package com.ty.employeeapp.employeeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.employeeapp.employeeapp.dao.EmployeeDao;
import com.ty.employeeapp.employeeapp.dto.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDao employeeDao;
	
	@GetMapping("employee")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		return employeeDao.saveEmployee(employee);
	}
	
	@PostMapping("get")
	public Employee fetchEmployee(@RequestParam int id)
	{
		return employeeDao.getEmployee(id);
	}
	
	@DeleteMapping("delete/{id}")
	public String updateEmployee(@PathVariable int id)
	{
		employeeDao.deleteEmployee(id);
		return "data deleted";
	}

}
 