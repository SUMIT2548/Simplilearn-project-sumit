package Lesson3;

public class MyThread extends Thread 
{
     public void run()
     {
    	 System.out.println("concurrent thread started running");
     }
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread();
		t1.start();

	}

}
