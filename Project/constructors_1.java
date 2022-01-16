package Project;

class EmployeeInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}


public class constructors_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeInfo employee1=new EmployeeInfo();
		EmployeeInfo employee2=new EmployeeInfo();

		employee1.display();
		employee2.display();
		}
	}

