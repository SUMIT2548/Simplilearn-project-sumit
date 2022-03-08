package Lesson1;

public class Typecasting {

	public static void main(String[] args) {
		// implicit convsersion
        System.out.println("Implicit type casting");
        
       char b ='G' ;
       System.out.println("value of b:" + b);
       
       int a ='b';
       System.out.println("value of a:" + a);
       
       float c = 'b';
       System.out.println("value of c:" + c);
       
       long d ='b';
       System.out.println("value of d:" + d);
       
       double e = 'b';
       System.out.println("value of e:" + e);
       
       System.out.println("/n");
       
       System.out.println("Explicit Type casting");
       //exaplicit convertion
      
       double X = 45;
       int y = (int)X;
       System.out.println("value of x" + X);
       System.out.println("value of y" + y);
      
	}

}
