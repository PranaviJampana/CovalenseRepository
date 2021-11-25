package com.cov.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cov.beans.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
