package Project;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Mahendar";   //creating a string 
		
		        //methods of strings		
				//to find length of string
				System.out.println(name.length());

				//substring
				System.out.println(name.substring(2));


				// to find string  IsEmpty or Not
 				String a="m";
				System.out.println(a.isEmpty());

				//converting toLowerCase
				String a1="GoodMorning";
				System.out.println(a1.toLowerCase());
				
				//converting toUpperCase
				String a2="goodmorning";
				System.out.println(a2.toUpperCase());
				

				//replacing a word from string
				String name3="Harry";
				System.out.println(name3.replace('r', 'p'));
				

				//checking both string are equal or not
				String i="happY neW yEAr";
				String j="Happy new YeaR";
				System.out.println(i.equals(j));
				
				
		 
				System.out.print("\n");
				System.out.println("StringBuffer");
				//Creating StringBuffer and append method
				StringBuffer greet=new StringBuffer("Happy new year!");
				greet.append("To you and your Families");
				System.out.println(greet);

				//inserting a word 'h' in greet string
				greet.insert(0, 'h');
				System.out.println(greet);

				//replacing a word 'Hel' in place of 'Wel'
				StringBuffer s1=new StringBuffer("Welcome!");
				s1.replace(0, 2, "Hel");
				System.out.println(s1);

				//deleting a word from string
				s1.delete(0, 2);
				System.out.println(s1);
				
				
				
				//StringBuilder
				System.out.print("\n");
				System.out.println("StringBuilder");
				StringBuilder s2=new StringBuilder("How are you");
				s2.append(" mahendar");
				System.out.println(s2);
                //deleting 1st char in s2    
				System.out.println(s2.delete(0, 1));
				
                //inserting "welcome" in s2 string
				System.out.println(s2.insert(2, "Welcome"));
                //reverse a string s2
				System.out.println(s2.reverse());
						
				//conversion	
				System.out.println("\n");
				System.out.println("Conversion of Strings to StringBuffer and StringBuilder\n");
				String greets = "Hello all Happy New Year"; 
		        
		        // conversion from String object to StringBuffer 
		        StringBuffer buffer = new StringBuffer(greets); 
		        buffer.reverse(); 
		        
		        System.out.println(buffer); 
		          
		        // conversion from String object to StringBuilder 
		        System.out.println();
		        StringBuilder builder = new StringBuilder(greets); 
		        builder.append(" world"); 
		        
		        System.out.println(builder);              


	}

}
