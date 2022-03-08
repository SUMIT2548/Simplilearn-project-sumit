package Lesson2;

public class MethodExecution  // method demo
{
     public int arithmetic (int a,int b)
     {
    	int z = a * b;
    	return z;
     }
     public static void main(String[] args) {
		// TODO Auto-generated method stub
        MethodExecution obj = new MethodExecution();
        int result = obj.arithmetic(12, 10);
        System.out.println("result:" + result);
	}

}
