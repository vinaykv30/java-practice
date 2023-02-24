
public class Test2 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("daemon thread");
	}
	public static void main(String args[])
	{
		System.out.println("main thread");
		Test2 t =new Test2();
		t.setDaemon(true);
		t.start();
	}

}
