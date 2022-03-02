package utility;

import java.util.Scanner;

public class AdminValidation {
	public static  boolean validate() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your credentials");
		System.out.println("Enter your Admin id");
		String id=sc.nextLine();
		System.out.println("Enter your password");
		String password=sc.nextLine();
		if(id.equals("Admin") && password.equals("admin"))
			return true;
		else 
			return false;
	}

}
