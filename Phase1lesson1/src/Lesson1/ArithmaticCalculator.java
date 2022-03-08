package Lesson1;
import java.util.Scanner;

public class ArithmaticCalculator {

	public static void main(String[] args)
	{
		double num1, num2, result; //declare variable
		
		Scanner obj = new Scanner(System.in);  // scanner object
		while(true)
		{
		// input form user
		System.out.println("enter the 1st number");
		num1 = obj.nextDouble();
		System.out.println("enter the 2nd number");
		num2 = obj.nextDouble();

		System.out.println("Enter your choice");
		int y = obj.nextInt();
		
		 // validating user choices
		if(y==1)
		{
			result = (num1+num2);
			System.out.println("The Result Of Addition:" + result);
			
		}
		else if(y==2)
		{
			result = (num1-num2);
			System.out.println("The Result Of Subtraction:" + result);
		
		}
		else if(y==3)
		{
			result = (num1*num2);
			System.out.println("The Result Of Multiplication:" + result);
			
		}
		else if (y==4)
		{
			result = (num1/num2);
			System.out.println("The Result Of Divison:" + result);
			
		}
		else
		{
			System.out.println("Wrong Choice");
			break;
		}
		}	
	}

}
