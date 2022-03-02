package service;

import java.util.Scanner;

import controller.Main;
import dao.PrincipalDao;
import utility.AdminValidation;

public class Admin {

	public void homeAdmin() throws Exception 
	{
		PrincipalDao empDao = new PrincipalDao();

			if(AdminValidation.validate())
			{	
				System.out.println("Login successfull");
				System.out.println();
			
				System.out.println("-----Admin Desk-----");
				System.out.println("1.New Principal Registration");
				System.out.println("2.View All Principal Records");
				System.out.println("3.Delete Principal Record");
				System.out.println("4.Logout");
				Scanner sc=new Scanner(System.in);
				int sel=0;
				boolean flag=true;
					while(flag)
					{
						try {
						 sel=Integer.parseInt(sc.nextLine());
						 flag=false;
						}
						catch(Exception e)
						{
							System.out.println("Invalid Input Please enter the valid");
							flag=true;
						}
					}
					switch(sel)
					{
					case 1: System.out.println("---New Principal Registration---");
							Principal p=new Principal();
							p.newPrincipal();
							break;
					case 2:System.out.println("---View principal Registration Records---");
					        empDao.viewPrincipalTableRecord();
					        break;
					case 3: System.out.println("Enter Employee Id to delete the Record");
					        String pId = sc.nextLine();
							empDao.deletePrincipalTableRecord(pId);
							break;
					case 4:Main.main(null);	
					}
			}
			else
				System.out.println("Invalid Admin Credentials");
			Main.main(null);
	     
	}
}
			
