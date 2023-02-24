
public class Test5 extends Thread
{
	public void run()
	{
		System.out.println("Deamon thread");
	}
	public static void main(String[] args)
	{
		Thread.currentThread().setDaemon(true);
		System.out.println("main thread");
		
		Test5 t=new Test5();
		t.setDaemon(true);
		t.start();
		
	}

}
