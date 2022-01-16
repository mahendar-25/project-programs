package Project;
import java.util.*;
public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // map
		
		//using Hashmap 
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Mahendar");    
	      hm.put(2,"Manisha");    
	      hm.put(3,"Rajesham");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //using HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Lata");  
	      ht.put(5,"Maheshuni");  
	      ht.put(6,"Shaymalrao");  
	      ht.put(7,"Vidyasagar");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //using TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Anil");    
	      map.put(9,"Sravan");    
	      map.put(10,"AlluArjun");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      


	}

}
