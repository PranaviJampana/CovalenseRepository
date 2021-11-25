package com.cov.tester;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

	public int add(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		return sum;

	}

	public int mul(int num1, int num2) {
		int mul;
		mul = num1 * num2;
		return mul;
	}

	public int div(int num1, int num2) {
		int div;
		div = num1 / num2;
		return div;
	}

	public int sub(int num1, int num2) {
		int sub;
		sub = num1 - num2;
		return sub;
	}

}
