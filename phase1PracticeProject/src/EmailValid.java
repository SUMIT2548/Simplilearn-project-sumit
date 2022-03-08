import java.util.regex.*;    
import java.util.*;    

public class EmailValid
{
	public static void main(String[] args) 
	{
		 ArrayList<String> emails = new ArrayList<String>();  
	        
	        emails.add("sumTsaha@gmail.com.com");  
	        emails.add("sumitR-Saha#@domain.co.in");  
	        emails.add("sumit.saha@gsk.com");  
	        emails.add("sumiT.k@domaincom");  
	        emails.add("Sumit.example.com");
	        emails.add("sumite#example.com");
	        emails.add("@sumit.me.org");
	        
	         //Regular Expression   
	        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
	        
	        //Compile regular expression to get the pattern  
	        Pattern pat = Pattern.compile(regex);  
	        
	        //Iterate emails array list  
	        for(String email : emails)
	        {  
	             //Create instance of matcher   
	            Matcher mat = pat.matcher(email);  
	            System.out.println(email +" : "+ mat.matches()+"\n"); 
	        }
     }
}
