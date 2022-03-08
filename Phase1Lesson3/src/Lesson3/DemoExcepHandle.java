package Lesson3;

class Exception1 extends Exception{
	   String str1;
	   Exception1(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}


public class DemoExcepHandle
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new Exception1("This is My error Message");
		}
		catch(Exception1 exp)
		{
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}


	}

}
