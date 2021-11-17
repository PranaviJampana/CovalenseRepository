package com.cov.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cov.beans.Department;
import com.cov.beans.Employee;


public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	Optional<Department> findByDeptno(Integer deptno);
	
	
	

}
