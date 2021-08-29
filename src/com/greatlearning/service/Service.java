package com.greatlearning.service;

import java.util.Random;

public class Service {

	String emailId;

	public void generateEmailId(String firstName, String lastName, String department){

		System.out.println("Email ID: "+firstName+lastName+"."+department+"@greatlearning"+"."+"com");
	}

	public void passWordGen() {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[8];

		password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));

		for(int i = 4; i< 8 ; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		System.out.print("Password: ");
		System.out.println(password);

	}

	public Service() {
		// TODO Auto-generated constructor stub
	}

}
