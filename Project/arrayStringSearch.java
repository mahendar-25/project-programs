package Project;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class arrayStringSearch {
	public static boolean isValidEmail(String email) {
		   String regex = "^(.+)@(.+)$";
		 //initialize the Pattern object
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(email);
	       return matcher.matches();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> emails = new ArrayList<String>();
	       // valid email addresses
	       emails.add("mahendar.maheshuni@gmail.com");
	       emails.add("manisha.maheshuni@gmail.com");
	       emails.add("sagarpatel@gmail.com");
	       //invalid email addresses
	       emails.add("sagar.gmail.com");
	       emails.add("shaymalrao..uppu@example.com");
	       emails.add("gaurav@.example.com");

	       for (String value : emails) {
	           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
	       }
	       
	       System.out.println("Enter any email address to check");
	       Scanner s = new Scanner(System.in);
	       String input = s.nextLine();
	       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));

	}

}
