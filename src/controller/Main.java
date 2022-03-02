package controller;

import java.util.Scanner;

import service.Admin;
import service.Principal;
//import service.Teacher;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		boolean bool=true;
		int select=0;

		while(bool) 
		{
			System.out.println("-----School Management System-----");
			System.out.println("1.Admin \n2.Principal ");
			try {
				select=sc.nextInt();	
				bool=false;
			}
			catch(Exception e)
			{
				System.out.println("Invalid Input.Please Enter the valid one.");
			     main(null);
			}
		}
		switch(select)
		{
		case 1: Admin a=new Admin();
				a.homeAdmin();
		        bool=false;
		        break;
		case 2: Principal p=new Principal();
				p.homePrincipal();
		 		bool=false;
				break;
		//case 3: Teacher t=new Teacher();
			//	bool=false;
				
		default:System.out.println("Invalid Input");
		         main(null);
		}
			}
			
		
		
		

	

}
