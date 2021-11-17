package com.cov.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cov.beans.Department;
import com.cov.beans.Employee;
import com.cov.exception.InvalidDepartmentIdException;
import com.cov.exception.InvalidEmployeeIdException;
import com.cov.repo.DepartmentRepository;

@Service

public class DepartmentService {
	@Autowired
	DepartmentRepository departmentRepository;
	private Integer id;

	public List<Department> findAll() {

		return departmentRepository.findAll();
		
	}
	public Department findById(int id) throws InvalidEmployeeIdException {
		Optional<Department> depOptional = departmentRepository.findById(id);
		if (!depOptional.isPresent()) {
			throw new InvalidEmployeeIdException("Employee ID " + id + " not existing in repository");

		}
		return depOptional.get();
	}
	public Department save(Department department) {
		return departmentRepository.save(department);
	}
	public Department update(Department department) throws InvalidEmployeeIdException {
		Optional<Department> depOptional = departmentRepository.findById(id);
		if (!depOptional.isPresent()) {
			throw new InvalidEmployeeIdException("Employee ID " + department.getId() + " not existing in repository");

		}
		return departmentRepository.save(department);
	}

	public Department delete(int id) throws InvalidEmployeeIdException {

		Optional<Department> depOptional = departmentRepository.findById(id);
		if (!depOptional.isPresent()) {
			throw new InvalidEmployeeIdException("Employee ID " + id + " not existing in repository");
		}
		Department department = depOptional.get();
		departmentRepository.deleteById(id);
		return department;
	}
	public Department findByDeptno(int deptno) throws InvalidDepartmentIdException{
		Optional<Department> depOptional = departmentRepository.findByDeptno(deptno);
		if (!depOptional.isPresent()) {
			throw new InvalidDepartmentIdException("Employee ID " + deptno + " not existing in repository");

		}
		return depOptional.get();
	
		
	}
	
	
	 }
