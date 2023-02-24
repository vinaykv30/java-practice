package threadnamedemo;

public class Test2 extends Thread
{
	public void run()
	{
		

	System.out.println("thread task : "+Thread.currentThread().getName());
	}
public static void main(String args[])
{
	System.out.println("hello : "+Thread.currentThread().getName());
	Test2 t1=new Test2();
	t1.setName("deepak");
	t1.start();
	
	Test2 t2=new Test2();
	t2.setName("smart programming");
	t2.start();
}
}
	
	


