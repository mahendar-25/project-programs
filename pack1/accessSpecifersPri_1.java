package pack1;


//private access specifier
class privateaccessspecifier 
{ 
   private void display() 
    { 
        System.out.println("using private access specifier"); 
    } 
} 


public class accessSpecifersPri_1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Private Access Specifier");
		//trying to access private method of another class 
		privateaccessspecifier  object = new privateaccessspecifier(); 
        //object.display();


	}

}
