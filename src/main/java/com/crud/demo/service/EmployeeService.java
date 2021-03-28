package com.crud.demo.service;

import java.util.List;

import com.crud.demo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int employeeId);
}
