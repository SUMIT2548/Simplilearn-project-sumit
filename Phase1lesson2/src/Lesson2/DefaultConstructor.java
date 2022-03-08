package Lesson2;
 class Constructor
 {
	 int id;
	 String name;
	 
	 void Demo() 
	 {
		System.out.println(id+""+name); 
	 }
 }
public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Constructor obj = new Constructor();
 Constructor obj1= new Constructor();
 obj.Demo();
 obj1.Demo();
   
 
	}

}
