package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Employee;
import com.example.demo.mapper.EmployeeMapper;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeMapper employeeMapper;
	
	public List<Employee> getEmployeeList(){
		List<Employee> employeeList = employeeMapper.getEmployeeList();
		return employeeList;
	}
	
	public Employee getEmployeeById(int id) {
		Employee employeeId = employeeMapper.getEmployeeById(id);
		return employeeId;
		
	}
	
	public int insertEmployee(Employee employee) {
		int insert = employeeMapper.insertEmployee(employee);
		return insert;
	}
	
	public void updateEmployee(Employee employee) {
		employeeMapper.updateEmployee(employee);
	}
	
	public void deleteEmployee(int id) {
		employeeMapper.deleteEmployee(id);
	}
}
