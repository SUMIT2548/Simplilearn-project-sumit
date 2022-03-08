package Lesson3;

public class MyClassWaitSleep 
{
	 //create an instance of the Object   
	public static Object obj = new Object();
    
    //main() method starts with handling InterruptedException  
	public static void main(String[] args) throws InterruptedException
	{
	  //pause process for one second  
	  Thread.sleep(1000);
	  
	  System.out.println(Thread.currentThread().getName() + "is woken after sleeping for 1 second");
	  
	  //create synchronizec context from which we call Wait() method  
	  synchronized(obj)
	  {
		//use wailt() method to set obj in waiting state for one seconds  
		  obj.wait(1000);
		  System.out.println(obj + " Object is in waiting state and woken after 1 seconds");
	  }

	}

}
