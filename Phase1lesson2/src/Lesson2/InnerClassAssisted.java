package Lesson2;

public class InnerClassAssisted 
{
	private String msg = " Welcome to java";
    
    class Inner
    {
      void hello()
      {
    	  System.out.println(msg+", let us start learing inner classes");
      }
    }
	public static void main(String[] args)
	{
		InnerClassAssisted obj = new InnerClassAssisted();
        InnerClassAssisted.Inner in = obj.new Inner(); 
        in.hello();
	}

}
