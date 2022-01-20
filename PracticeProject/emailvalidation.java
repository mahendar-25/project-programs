package Project;

import java.util.*;

public class emailvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your email id");
			
			String EmailId = sc.nextLine();
			
			if(validateUserEmailid(EmailId))
				System.out.println("email address is Valid ");
			else
				System.out.println("email address is invalid  ");

		}
		
		
	private static boolean validateUserEmailid(String userEmailId) {
		String pattern = "^(.+)@(.+)$";
		
		if(userEmailId.matches(pattern))
			return true;
		return false;
		
	}
	}
