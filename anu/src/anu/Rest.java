package anu;

public class Rest {
    void show()
	{
		System.out.println("1");
	}

}
class Xyz extends Rest
{
	void show()
	{
		System.out.println("2");
	}
	public static void main(String args[])
	{
		Rest r=new Rest();
		r.show();
		
		Xyz ob=new Xyz();
		ob.show();
	}
}
