package com.chethiya.ems.service;

import java.util.List;

import com.chethiya.ems.model.Employee;

public interface EmployeeService {

		Employee save(Employee employee);
		List<Employee> fetchAllEmployee();
		Employee fetchEmployee(Employee employee);
}
