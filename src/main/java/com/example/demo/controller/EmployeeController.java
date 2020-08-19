package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.Employee;
import com.example.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/getEmployeeList", method = RequestMethod.GET)
	public @ResponseBody List<Employee> getEmployeeList() {
		List<Employee> employeeList = employeeService.getEmployeeList();
		return employeeList;
	}

	@RequestMapping(value = "/getEmployeeId", method = RequestMethod.GET)
	public @ResponseBody Employee getEmployeeById(@RequestParam(value = "id") int id) {
		Employee employeeId = employeeService.getEmployeeById(id);
		return employeeId;
	}

	@RequestMapping(value = "/insertEmployee", method = RequestMethod.POST)
	public @ResponseBody int insertEmployee(Employee employee) {
		int insertemployee = employeeService.insertEmployee(employee);
		return insertemployee;
	}

	@RequestMapping(value = "/updateEmployee", method = RequestMethod.PUT)
	public @ResponseBody void updateEmployee(Employee employee) {
		employeeService.updateEmployee(employee);
	}

	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.DELETE)
	public @ResponseBody void deleteEmployee(@RequestParam(value = "id") int id) {
		employeeService.deleteEmployee(id);
	}
}
