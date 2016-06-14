package com.kushal.dao;

import java.util.List;

import com.kushal.beans.Employee;

public interface EmployeeDao {
	 
	 public void addEmployee(Employee employee);

	 public List<Employee> listEmployeess();
	 
	 public Employee getEmployee(int empid);
	 
	 public void deleteEmployee(Employee employee);
	}

