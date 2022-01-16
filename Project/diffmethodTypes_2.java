package Project;

public class diffmethodTypes_2 {
	public void area(int h,int b)
    {
         System.out.println("Area of Triangle : "+(0.5*h*b));
    }
    public void area(int radius) 
    {
         System.out.println("Area of Circle : "+(3.14*radius*radius));
    }

    public static void main(String args[])
   {

diffmethodTypes_2 ans=new diffmethodTypes_2();
       ans.area(35,25);
       ans.area(10);  
   }


}
