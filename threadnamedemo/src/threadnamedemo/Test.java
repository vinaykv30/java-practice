package threadnamedemo;

public class Test extends Thread
{
	public void run()
	{
		System.out.println("thread task is executed by "+Thread.currentThread().getName());
	}
	public static void main(String args[])
	{
		System.out.println("hello is printed by "+Thread.currentThread().getName());
		Test t1=new Test();
		t1.start();
	}

}
