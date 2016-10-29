package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

@SpringBootApplication
public class DidemoApplication implements CommandLineRunner {

	@Autowired
	Calculator calcAuto;

	@Override
	public void run(String... strings) throws Exception {

		int a = 3;
		int b = 2;

		// TestA
		Calculator calcA = new CalculatorPlus();
		int resA = calcA.calc(a, b);
		System.out.println("TestA: " + resA);

		// TestB
		Calculator calcB = new CalculatorMinus();
		int resB = calcB.calc(a, b);
		System.out.println("TestB: " + resB);

		// TestC
		int resC = calcAuto.calc(a, b);
		System.out.println("TestC: " + resC);
		
		// Pbkdf2Password
		/*
		String pw = "test";
		System.out.println("Pbkdf2Password: " + pw);
		System.out.println(new Pbkdf2PasswordEncoder().encode(pw));
		*/

	}

	public static void main(String[] args) {
		SpringApplication.run(DidemoApplication.class, args);
	}
}
