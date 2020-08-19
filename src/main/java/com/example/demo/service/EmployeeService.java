package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.dto.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao employeeDao;

	public List<Employee> getEmployeeList() {
		List<Employee> employeeList = employeeDao.getEmployeeList();
		return employeeList;

	}

	public Employee getEmployeeById(int id) {
		Employee employeeId = employeeDao.getEmployeeById(id);
		return employeeId;
	}

	public int insertEmployee(Employee employee) {
		int insertemployee = employeeDao.insertEmployee(employee);
		return insertemployee;
	}

	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
	}

	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);
	}

}
