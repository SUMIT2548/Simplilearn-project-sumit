import java.io.*;

public class FileHandlingWrite
{
	public static void main(String[] args)
	{
		 try
		 {
		FileWriter f = new FileWriter("E:\\sumitmphas\\File.Txt");
		 try
		 {
		 f.write("Hello Everyone i sumit kumar saha");
		 }
		 finally
		 {
		 f.close();
		 }
		 System.out.println("Task Completed");
		 }
		 catch(IOException i)
		 {
		 System.out.println(i);
		 } 

	}

}
