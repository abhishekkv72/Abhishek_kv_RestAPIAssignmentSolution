package com.greatLearning.employeeManagements.service;

import java.util.List;

import com.greatLearning.employeeManagements.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	public void save(Employee employee);

	public void deleteById(int Id);

	public Employee findById(int Id);

}
