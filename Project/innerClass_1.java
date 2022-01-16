package Project;

public class innerClass_1 {
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
		 innerClass_1  ob=new innerClass_1 ();  
			ob.display();  
			}



}
