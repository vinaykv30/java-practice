package threadyield;

public class Test extends Thread 
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
	public static void main(String args[])
	{
		Test t=new Test();
		t.start();
		
		for(int i=1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}

}
