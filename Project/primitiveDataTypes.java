package Project;

public class primitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Implicit Type Casting");
		
		//converting strings to other Datatypes
		
		//converting to char
		//taking a='B' as string input

		char a='B';
		System.out.println("Value of a is "+a);
		
		//converting to integer
		int b=a;
		System.out.println("Value of b is "+b);
		
		//converting to float
		float c=a;
		System.out.println("Value of c is "+c);
		
		//converting to long
		long d=a;
		System.out.println("Value of d is "+d);
		
		//converting to double
		double e=a;
		System.out.println("Value of e is "+e);
		
				
		System.out.println("\n");
		
		
		
		System.out.println("Explicit Type Casting");
		
		float x=50.5f;
		//converting float to integer
		int y=(int)x;
		System.out.println("Value of x is "+x);
		System.out.println("Value of y is "+y);


	}

}
