import java.io.*;
public class FilehandlingAppend 
{
	public static void main(String[] args) 
	{
		 String path = "E:\\\\\\\\sumitmphas\\\\\\\\File.Txt";
		 String text = " From kolkata ";
		 try
		 {
		 FileWriter f = new FileWriter(path,true);
		 f.write(text);
		 f.close();
		 System.out.println("Append Executed");
		 }
		 catch(IOException e)
		 {
		 System.out.println(e);
	     }
	}
}
