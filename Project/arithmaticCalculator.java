package Project;
import java.util.*;
public class arithmaticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number1");
		System.out.println("enter a number2");
		
		int num1=s.nextInt();
		int num2=s.nextInt();
		
		System.out.println("enter your choice: (+,-,*,/,%)");
		
		char op=s.next().charAt(0);
		
		switch(op) {
		case '+':
			System.out.println("addition of two numbers is " +(num1+num2));
			break;
		case '-':
			System.out.println("substraction of two numbers is " +(num1-num2));
			break;
		case '*':
			System.out.println("multiplication of two numbers is " +(num1*num2));
			break;
		case '/':
			if(num2==0) {
				System.out.println("invalid division");
			}else {
			System.out.println("division of two numbers is " +(num1/num2));
			}
			break;
		case '%':
			if(num2==0) {
				System.out.println("invalid division");
			}else {
			System.out.println("remainder of two numbers is " +(num1%num2));
			}
			break;
			default:
				System.out.println("invalid");
			
		}
		
	

	}

}
