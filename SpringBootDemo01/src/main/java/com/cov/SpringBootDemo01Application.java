package com.cov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cov.tester.Calculator;

@SpringBootApplication
public class SpringBootDemo01Application {

	public static void main(String[] args) {
		ApplicationContext ctxt = SpringApplication.run(SpringBootDemo01Application.class, args);
		Calculator calc = ctxt.getBean(Calculator.class);
		int result = calc.add(10, 15);
		int res = calc.mul(2, 3);
		int res1 = calc.div(2, 3);
		int res2 = calc.sub(2, 3);

		System.out.println("sum : " + result);
		System.out.println("mul : " + res);
		System.out.println("div : " + res1);
		System.out.println("sub : " + res2);
	}

}
