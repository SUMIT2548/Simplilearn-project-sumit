package Lesson2;

 abstract class AnonymousInnerClass
 {
    public abstract void display();
 
	public static void main(String[] args) 
	{
	AnonymousInnerClass obj = new AnonymousInnerClass()
			{
		public void display()
		{
			System.out.println("Anonymous Inner Class");
		}
			};
    obj.display();
	}
}
 
