package Project;


import java.util.Arrays;
import java.util.List;


public class arrayStringSearch {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String[] alphabet = new String[]{"Mahendar", "Maheshuni", "Manisha"," Rajesham","Lata"};

        // Convert String Array to List
        List<String> list = Arrays.asList(alphabet);
        
        if(list.contains("Maheshuni"))
            System.out.println("The String Maheshuni is Found in the Array List");
            else
            	System.out.println("The String You Have Entered is not in the Array List");

	}

}
