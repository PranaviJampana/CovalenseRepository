package com.cov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cov.beans.Employee;
import com.cov.controller.EmployeeController;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctxt = SpringApplication.run(SpringBootJpaApplication.class, args);
		EmployeeController controller=(EmployeeController) ctxt.getBean(EmployeeController.class);
		Employee employee=new Employee(101, "pranavi", 10);
		controller.save(employee);
		controller.find(101);
		controller.findAll();
		controller.delete(101);
		
	}

}
