package utility;

import java.util.Scanner;

public class PrincipalValidation {

	public static boolean validate() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your credentials");
		System.out.println("Enter your Principal id");
		String id=sc.nextLine();
		System.out.println("Enter your password");
		String password=sc.nextLine();
		if(id.equals("Princi") && password.equals("principal"))
			return true;
		else 
			return false;
	}
}
