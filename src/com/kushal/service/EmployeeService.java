package com.kushal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kushal.beans.Employee;
@Service
public interface EmployeeService {
	 
	 public void addEmployee(Employee employee);

	 public List<Employee> listEmployeess();
	 
	 public Employee getEmployee(int empid);
	 
	 public void deleteEmployee(Employee employee);
	
}
