package assitedproject;

class myException extends Exception{
   String s1;
   myException(String s2) {
	s1=s2;
   }
   public String toString(){ 
	return ("myException Occurred: "+s1) ;
   }
}

public class ExceptionHandler {
	class Ex{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("Starting of try block");
			
			throw new myException("This is My error Message");
		}
		catch(myException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}

	}

}
