package service;

import java.util.Scanner;

import Model.PrincipalModel;
import Model.TeacherModel;

public class Teacher {
Scanner sc=new Scanner(System.in);
	public void newTeacher() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("------New Teacher Registration------");
		System.out.println("Enter Id:");
		String teachId=sc.nextLine();
		
		System.out.println("Enter Name:");
		String name=sc.nextLine();
	   
	
		System.out.println("Enter Phone Number:");
		long phone=sc.nextLong();
		
		System.out.println("Enter Highest Graduation:");
		String graduation=sc.next();
		sc.nextLine();
		
		System.out.println("Enter the previous institute name that you were working: ");
		String lastWork=sc.nextLine();
	
		System.out.println("Enter the Salary");
		double salary=sc.nextDouble();
		
		TeacherModel tm=new TeacherModel(teachId,name,phone,graduation,lastWork,salary);
		TeacherDetails td=new TeacherDetails();
		td.addTeacherToList(tm);
		
	}

}
