package com.chethiya.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chethiya.ems.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
