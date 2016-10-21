package com.example;

import org.springframework.stereotype.Component;

@Component
public class CalculatorPlus implements Calculator {
	@Override
	public int calc(int a, int b) {
		return a + b;
	}
}
