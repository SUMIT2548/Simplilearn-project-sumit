package Lesson2;
class Messi
{
	int studentid; 
	String studentname; 
	
 Messi( int id, String name )
 {
	 studentid = id;
	 studentname = name;
 }
 
 void display()
 {
	 System.out.println(studentid +" "+ studentname);
 }
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Messi obj1 = new Messi(1,"Ram");
  Messi obj2 = new Messi(2,"sumit");
  obj1.display();
  obj2.display();
  
  }

}
