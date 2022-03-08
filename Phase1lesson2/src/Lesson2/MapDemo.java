package Lesson2;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		//map
            // hashmap
		    
		HashMap<Integer, String> a = new HashMap<Integer,String>();
		    a.put(1, "sumit");
		    a.put(2, "amit");
		    a.put(3, "rahul");
		    System.out.println("\n the elements of hashmap are" );
		    for(Map.Entry m:a.entrySet())
		    {
		    	System.out.println(m.getKey()+""+m.getValue());	
		    }
		    
		     //Hashtable
		    Hashtable<Integer, String> b = new Hashtable<Integer,String>();
		        b.put(4,"susmita");
		        b.put(5, "pallabi");
		        b.put(6, "supratim");
		        b.put(7, "suman");
		        System.out.println("\n the element of hashtable");
		        for(Map.Entry n:b.entrySet())
		        {
		        	System.out.println(n.getKey()+""+n.getValue());
		        }
		        
		      //treemap
		        TreeMap<Integer,String> set = new TreeMap<Integer,String>();
		        set.put(8, "subir");
		        set.put(9, "soumik");
		        set.put(10, "hqgfg");
		        System.out.println("\n the element of treemap");
		        for(Map.Entry i:set.entrySet())
		        {
		        	System.out.println(i.getKey()+""+i.getValue());
		        }
		        	
		
	}

	
}
