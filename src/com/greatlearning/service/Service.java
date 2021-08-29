package com.greatlearning.service;

import java.util.Random;

public class Service {

	String emailId;

	public void generateEmailId(String firstName, String lastName, String department){

		System.out.println("Email ID: "+firstName+lastName+"."+department+"@greatlearning"+"."+"com");
	}

	public void passWordGen() {
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi"
				+"jklmnopqrstuvwxyz!@#$%&";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(8);
		for (int i = 0; i < 8; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		System.out.println("Password : "+sb.toString()+"$");

	}
	public Service() {
		// TODO Auto-generated constructor stub
	}

}
