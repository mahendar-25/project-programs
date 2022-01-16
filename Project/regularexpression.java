package Project;


import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class regularexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

			String pattern = "[a-z]+";
			String check = "Hello, Iam Mahendar Im Learning Java Strings";
			Pattern var = Pattern.compile(pattern);
			Matcher word = var.matcher(check);
			
			
			//condition check using find() method
			while (word.find())
		      	System.out.println( check.substring( word.start(), word.end() ) );
			


	}

}
