
public class Test3 extends Thread
{

	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("daemon thread");
		}
		else
		{
			System.out.println("child thread");
		}
	}
		
	public static void main(String args[])
	{
		System.out.println("main thread");
		Test3 t =new Test3();
		//t.setDaemon(true);
		t.start();
	}

}


