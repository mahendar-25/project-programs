package Project;
import java.util.*;
public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        //creating of arraylist
				System.out.println("ArrayList");
				ArrayList<String> state=new ArrayList<String>();   
			      state.add("Maharashtra");//
			      state.add("Telangana");    	   
			      System.out.println(state);  
				
				//creating of vector
			      System.out.println("\n");
			      System.out.println("Vector");
			      Vector<Integer> vector = new Vector();
			      vector.addElement(10); 
			      vector.addElement(20); 
			      System.out.println(vector);
				
				//creating of linkedlist
			      System.out.println("\n");
			      System.out.println("LinkedList");
			      LinkedList<String> name=new LinkedList<String>();  
			      name.add("Mahendar");  
			      name.add("Maheshuni");  	      
			      Iterator<String> itr=name.iterator();  
			      while(itr.hasNext()){  
			       System.out.println(itr.next());  
			       
			       //creating hashset
			       System.out.println("\n");
			       System.out.println("HashSet");
			       HashSet<Integer> set=new HashSet<Integer>();  
			       set.add(100);  
			       set.add(200);  
			       set.add(300);
			       set.add(400);
			       System.out.println(set);
			       
			       //creating linkedhashset
			       System.out.println("\n");
			       System.out.println("LinkedHashSet");
			       LinkedHashSet<Integer> set1=new LinkedHashSet<Integer>();  
			       set1.add(10);  
			       set1.add(20);  
			       set1.add(30);
			       set1.add(40);	       
			       System.out.println(set1);
			      	} 

	}

}
