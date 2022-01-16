package Project;

public class innerClass {
     private String name="Welcome to Class"; 
	 
	 class Inner{  
	  void greetings(){System.out.println(name+", Let's start our tutorial of java programming language ");}  
	 }  


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innerClass object=new innerClass();
		innerClass.Inner in=object.new Inner();  
		in.greetings();  


	}

}
