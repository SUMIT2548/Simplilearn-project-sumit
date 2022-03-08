package Lesson1;

class privatemodifier
{
	private void display()
	{
		System.out.println("my name is sumitkumarsaha");
	}
}


public class Privateaccessmodifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//private
      System.out.println("private access specifier");
      privatemodifier obj = new privatemodifier();
     // obj.display();
	}

}
