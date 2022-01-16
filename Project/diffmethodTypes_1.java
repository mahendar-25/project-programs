package Project;

public class diffmethodTypes_1 {
	int val=100;

	int operation(int val) {
		val =val*10/100;
		return(val);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diffmethodTypes_1 d = new diffmethodTypes_1();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);
    }
}
