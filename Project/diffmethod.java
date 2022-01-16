package Project;

public class diffmethod {
	public int dividenumbers(int num1,int num2) {
		int num=num1/num2;
		return num;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diffmethod num2=new diffmethod();
		int ans= num2.dividenumbers(10,4);
		System.out.println("Division is :"+ans);
		

	}

}
