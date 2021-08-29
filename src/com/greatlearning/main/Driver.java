package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.Service;

public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee em1=new Employee();

		Service s1= new Service();

		boolean flag=true;
		boolean flag2=true;

		String firstName;
		String lastName;

		Scanner sc = new Scanner(System.in);
		String department = null;
		int ch=0;
		try {
			do{
				System.out.println("Enter your department from following\n"+"1. Technical\n"+"2. Admin\n"+"3. Human Resource\n"+"4. Legal\n"+"0 : Exit");
				ch = sc.nextInt();
				switch(ch) {
				case 0 : {
					ch=0;
					flag=false;
					System.out.println("closing the application");

				}break;
				case 1: {
					department="technical";
					flag2=false;
				}break;
				case 2: {
					department="admin";
					flag2=false;
				}break;
				case 3: {
					department="humanresource";
					flag2=false;
				}break;
				case 4: {
					department="legal";
					flag2=false;
				}break;
				default:
					System.out.println("choose any no. from 1 to 4");
				}

			}while(ch!=0 && flag2);

			//System.out.println("Dear "+em1.getFirstName()+" your generated credentials are as followed");

			while(flag) {

				sc.nextLine();
				System.out.println("Enter your First name");
				firstName = sc.nextLine();
				System.out.println("Enter your Last name");
				lastName = sc.nextLine();

				if(firstName.isEmpty() && lastName.isEmpty()) {
					System.out.println("You have not entered any value \n please enter a valid input\n");
				}else {
					em1.setFirstName(firstName);
					em1.setLastName(lastName);
					s1.generateEmailId(em1.getFirstName(),em1.getLastName(),department);
					s1.passWordGen();
					flag=false;

				}

			}
		}finally {
			sc.close();
		}
	}

}
