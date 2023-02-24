
public class Test1 extends Thread
{

	public void run()
	{
		System.out.println("child thread");
	}
	public static void main(String args[])
	{
		System.out.println("main thread");
		Test t=new Test();
		t.start();
	}

}
