package service;

import java.util.Scanner;

import Model.PrincipalModel;
import controller.Main;
import dao.StudentDao;
import dao.TeacherDao;
import utility.PrincipalValidation;

public class Principal {
Scanner sc=new Scanner(System.in);

	
	public void homePrincipal() throws Exception
	{
		int select;
		if(PrincipalValidation.validate())
		{
			System.out.println("Login successfull");
			System.out.println();
			do {
		System.out.println("------Principal Control Desk------");
		System.out.println("1.Add Teacher");
		System.out.println("2.View Teacher Records");
		System.out.println("3.Add Student");
		System.out.println("4.View Student Records");
		System.out.println("5.Delete Teacher Record");
		System.out.println("6.Delete Student record");

		select=sc.nextInt();
		switch(select)
		{
		case 1: Teacher t=new Teacher();
				t.newTeacher();
				break;
		case 2: TeacherDao td=new TeacherDao();
				td.viewTeacherTableRecord();
		case 3: Student s=new Student();
				s.newStudent();
				break;
		case 4: StudentDao sd=new StudentDao();
				sd.viewStudentTableRecord();
				break;
		case 5: System.out.println("Enter the Teacher Id to delete");
				String sId=sc.next();
			TeacherDao td1=new TeacherDao();
				td1.deleteTeacherTableRecord(sId);
				break;
		case 6: System.out.println("Enter the Student Id to delete");
		         String sId1=sc.next();
			      StudentDao sdd=new StudentDao();
				sdd.deletestudentTableRecord(sId1);
		default: System.out.println("Invalid input");
		}
			}
		while(select!=1 && select!=2 && select!=3 && select!=4 && select!=5 && select!=6);
		
		
		}
		else
		
			{
				System.out.println("Login UnSuccessfull");
				Main.main(null);
			}
		
		
		
	}
	
		
	
	public void newPrincipal() throws Exception
	{
		System.out.println("------New Principal Registration------");
		System.out.println("Enter Id:");
		String princiId=sc.nextLine();
		
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
		
		PrincipalModel pm=new PrincipalModel(princiId,name,phone,graduation,lastWork,salary);
		PrincipalDetails pd=new PrincipalDetails();
		pd.addPrincipalToList(pm);
		//System.out.println("Press 1 to go back to Home page");
		
		
		
		
	}

}
