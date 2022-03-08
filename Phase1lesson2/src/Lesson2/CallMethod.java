package Lesson2;

public class CallMethod // call by value
{
	int val = 150;
	
    public int Demo(int val)
    {
        val = val*10/100;
    	return val;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CallMethod obj = new CallMethod(); 
    	System.out.println("before operation the result is:" + obj.val);	 
    	obj.Demo(100);
    	System.out.println("after operation the result is:" + obj.val);
	}

}
