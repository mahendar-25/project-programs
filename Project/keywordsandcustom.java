package assitedproject;

public class keywordsandcustom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50,b=0,rs;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                rs = a / b;
                System.out.print("\n\tThe result is : " + rs);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.println("\tError : " + Ex.getMessage());
        }

        System.out.println("\tEnd of program.");


	}

}
