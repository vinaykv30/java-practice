package threadprioritiesdemo;

public class Test1 extends Thread
{
	public void run()
	{
		System.out.println("Child thread");
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread().getPriority());
		Test1 t=new Test1();
		t.start();
	}

}
