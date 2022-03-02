package service;

import java.util.Scanner;

import Model.StudentModel;

public class Student {

	public void newStudent() throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Id:");
		String sId=sc.next();
		
		System.out.println("Enter Student Name:");
		String name=sc.next();
		
		System.out.println("Enter Address:");
		String address=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter class :");
		String className=sc.nextLine();
		StudentModel sm=new StudentModel(sId,name,address,className);
		StudentDetails sd=new StudentDetails();
		sd.addStudentToList(sm);
		}
  
}
