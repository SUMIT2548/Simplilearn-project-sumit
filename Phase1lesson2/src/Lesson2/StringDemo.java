package Lesson2;

public class StringDemo {

	public static void main(String[] args) 
	{
		System.out.println("Methods of String");
		
		String sb = new String("Hello World");
		System.out.println(sb.length());
		
		//substring
		String sb1 = new String("Welcome Java");
		System.out.println(sb1.substring(2));

		// string comparison
		String s1 = "Hello";
		String s2 = "Hello";
		String s10 = "Sumit";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s10));
		System.out.println(s10.compareTo(s10));
		
		//isEmpty
		String s3 = "";
		String s4 = "javapoint";
		System.out.println(s3.isEmpty());
		System.out.println(s4.isEmpty());
		
		//toLowerCase
		String s5 = "HellO";
		System.out.println(s5.toLowerCase());
		
		//replace
		String sa = "Heldo";
		System.out.println(sa.replace('d', 'l'));
		
		//equals
		System.out.println(s1.equals(sa));
		
		/////////////////////
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		
		//creating stringbuffer and append method 
		StringBuffer a1 = new StringBuffer("Welcome to");
		System.out.println(a1.append("java"));
		
		//insert method
		a1.insert(0,'e');
		System.out.println(a1);
		
		//replace method
		StringBuffer a2 = new StringBuffer("Hello");
		a2.replace(0, 2, "hEl");
		System.out.println(a2);
		
		//delect method 
		StringBuffer a3 = new StringBuffer("Hello");
		System.out.println(a3.delete(0, 1));
		
		/////////
		//stringBuilder
		System.out.println("\n");
		System.out.println("creating stringbuilder");
		
		StringBuilder d1 = new StringBuilder("welcome java");
		System.out.println(d1.append("to javapoint"));
		
		//insert method
		System.out.println(d1.insert(1,"sumit"));
		//delect
	     System.out.println(d1.delete(0,1));
		//replace
		System.out.println(d1.reverse());
		
		//////////
		//conversion
		System.out.println("\n");
		System.out.println("conversion of string to stringBuffer and StringBuilder");
		
		   String str = "hello";
		   
		 //conversion from string object  to StringBuffer
		   StringBuffer sbr = new StringBuffer(str);
		   sbr.reverse();
		   System.out.println("String to StringBuffer");
		   System.out.println(sbr);
		   
		   //conversion from string object  to StringBuilder 
		   StringBuilder s11 = new StringBuilder(str);
		   s11.append("world");
		   System.out.println("String to StringBuilder");
		   System.out.println(s11);
	}
}