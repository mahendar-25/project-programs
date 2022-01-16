package Project;


//this is annonymous inner class type
abstract class anonymousInnerClass {
	   public abstract void display();
	}

public class innerClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		anonymousInnerClass name = new anonymousInnerClass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      name.display();
	   


	}

}
