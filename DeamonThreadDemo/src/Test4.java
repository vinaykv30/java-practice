
public class Test4 extends Thread
{
	public void run()
	{
		System.out.println("daemon thread");
	}
	public static void main(String args[])
	{
		System.out.println("main thread");
		Test4 t=new Test4();
		t.start();
		t.setDaemon(true);
	}

}
