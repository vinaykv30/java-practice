package anu;

public class Test {
	Object show()
	{
		System.out.println("1");
		return null;
	}

}
class Xyz extends Test
{
	StringBuffer show()
	{
		System.out.println("2");
		return null;
	}
	public static void main(String args[])
	{
		Test t=new Test();
		t.show();
		
		Xyz x=new Xyz();
		x.show();
	}
}
