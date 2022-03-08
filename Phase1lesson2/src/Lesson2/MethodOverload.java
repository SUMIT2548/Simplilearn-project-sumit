package Lesson2;

public class MethodOverload 
{
   public void Demo(int a, int b)
   {
	   System.out.println("Area of Triangle : "+(0.5*a*b));
   }
   public void Demo(int c)
   {
	   System.out.println("Area of Circle : "+(3.14*c*c));
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MethodOverload obj = new MethodOverload();
     obj.Demo(4,8);
     obj.Demo(10);
	}

}
