package Project;
class Student{
	int id;
	String name;

	Student(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+"  "+name);
	}
}



public class constructors_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1=new Student(2,"Mahendar");
		Student student2=new Student(10,"Maheshuni");
		student1.display();
		student2.display();


	}

}
