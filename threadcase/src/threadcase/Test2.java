package threadcase;
class MyThread1 extends Thread
{
	public void run()
	{
		System.out.println("task 1");
	}
}

public class Test2
{
	public static void main(String[] args)
	{
		MyThread1 thread1=new MyThread1();
		thread1.start();

		MyThread1 thread2=new MyThread1();
		thread2.start();

		MyThread1 thread3=new MyThread1();
		thread3.start();

		MyThread1 thread4=new MyThread1();
		thread4.start();
	}

}
