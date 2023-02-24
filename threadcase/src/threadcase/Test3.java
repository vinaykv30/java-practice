package threadcase;

class MyThread1 extends Thread
{
	public void run()
	{
		System.out.println("playing video");
	}

class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("playing music");
	}

class MyThread3 extends Thread
{
	public void run()
	{
		System.out.println("progress bar");
	}

class MyThread4 extends Thread
{
	public void run()
	{
		System.out.println("timer");
	}
}

public class Test3
{
	public static void main(String[] args)
	{
		MyThread1 thread1=new MyThread1();
		thread1.start();
		
		MyThread2 thread2=new MyThread2();
		thread2.start();
		
		MyThread3 thread3=new MyThread3();
		thread3.start();
		
		MyThread4 thread4=new MyThread4();
		thread4.start();
	}

}
