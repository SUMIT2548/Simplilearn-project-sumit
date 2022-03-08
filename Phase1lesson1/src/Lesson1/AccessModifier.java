package Lesson1;

class DefAccessmodifier
{
	void modifier()
	{
		System.out.println("i sumit kumar saha");
	}
}

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("default access specifier");
		DefAccessmodifier def = new DefAccessmodifier();
		def.modifier();
	}

}
