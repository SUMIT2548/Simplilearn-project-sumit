import java.util.Scanner;

public class ArithmeticCalculator 
{
	public static void main(String[] args) 
	{
	   double num1, num2, result;//declare variable
	   Scanner obj = new Scanner(System.in);// scanner object
	   
	   while(true)
	   {
		// input form user
	   System.out.println(" enter first number");
	   num1 = obj.nextDouble();
	   System.out.println("enter second number");
	   num2 = obj.nextDouble();
	   
	   System.out.println("enter your choice");
	   int y = obj.nextInt();
	   
	    // validating user choices
	   if(y==1)
	   {
		   result=num1+num2;
		   System.out.println("the result of addition:" +result);
	   }
	   else if(y==2)
	   {
		 result=num1-num2;
		 System.out.println("The result of subtraction:" +result);
	   }
	   else if(y==3)
	   {
		   result=num1*num2;
		   System.out.println("The result of multiplication:" +result);
	   }
	   else if(y==4)
	   {
		   result=num1/num2;
		   System.out.println("the result of divison:" +result);
	   }
	   else
	   {
		   System.out.println("wrong choice");
		   break;
	   }

	 }
   }
}
