
public class D {
	void m1()
	{
		System.out.println("i am in class D");
	}

}
class E extends D
{
	void m1()
	{
		System.out.println("i am in class E");	
	}
	void show()
	{
		m1();
		super.m1();
	}
	public static void main(String args[])
	{
		E ob=new E();
		ob.show();
	}
}



