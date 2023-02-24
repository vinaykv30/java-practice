package threadprioritiesdemo;

public class Test2 extends Thread
{

	public void run()
	{
		System.out.println("Child thread");
		System.out.println("Child thread priority  :"+Thread.currentThread().getPriority());
	}
	public static void main(String args[])
	{
		System.out.println("Main thread old priority : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("Main thread new priority : "+Thread.currentThread().getPriority());
		Test2 t=new Test2();
		t.start();
	}

}

