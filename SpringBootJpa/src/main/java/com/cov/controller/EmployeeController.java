package com.cov.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cov.beans.Employee;
import com.cov.repo.EmployeeRepository;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepository employeeRepository;

	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Optional<Employee> find(int i) {
		return employeeRepository.findById(101);

	}

	public Iterable<Employee> findAll() {
		return employeeRepository.findAll();
	}

	public void delete(int i) {
		employeeRepository.deleteById(101);

	}

}
