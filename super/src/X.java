
public class X {
	X()
	{
		System.out.println("i am in class X");
	}

}
class Y extends X
{
	Y()
	{
	super();
		System.out.println("i am i class Y");
	}
	public static void main(String srgs[])
	{
		Y ob=new Y();
	}
}
