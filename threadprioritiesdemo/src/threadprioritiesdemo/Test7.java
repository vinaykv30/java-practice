package threadprioritiesdemo;

public class Test7 {
	public void run()
	{
		System.out.println("Child thread");
		System.out.println("Child thread priority  :"+Thread.currentThread().getPriority());
	}
	public static void main(String args[])
	{
		System.out.println("Main thread old priority : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(6);
		System.out.println("Main thread new priority : "+Thread.currentThread().getPriority());
		Test5 t=new Test5();
		t.setPriority(3);
		t.start();
	}


	

}
