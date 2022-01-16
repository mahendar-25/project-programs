package pack1;
class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("Using defalut access specifier"); 
     } 
} 

public class accessSpecifiers_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       //default access Specifiers
				System.out.println("Dafault Access Specifier");
				defAccessSpecifier obj = new defAccessSpecifier(); 		  
		        obj.display(); 


	}

}
