package Lesson2;
// local inner class
public class InnerClassAssisted1 
{
	private String msg="Inner classes";
	
	void display()
	{
		class Inner
		{
			void ab()
			{
				System.out.println(msg);
			}
		}
	
	
	Inner i = new Inner();
	i.ab();
	}

	public static void main(String[] args)
	{
		InnerClassAssisted1 obj = new InnerClassAssisted1();
		obj.display();

	}

}
