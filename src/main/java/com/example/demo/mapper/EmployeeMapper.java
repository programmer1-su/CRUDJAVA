package com.example.demo.mapper;

import java.util.List;

import com.example.demo.dto.Employee;

public interface EmployeeMapper {

	public List<Employee> getEmployeeList();

	public Employee getEmployeeById(int id);

	public int insertEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(int id);
}
