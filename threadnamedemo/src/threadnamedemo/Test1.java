package threadnamedemo;

public class Test1 extends Thread
{
	public void run()
	{
		

	System.out.println("thread task : "+Thread.currentThread().getName());
}
public static void main(String args[])
{
	System.out.println("hello : "+Thread.currentThread().getName());
	Test1 t1=new Test1();
	t1.start();
	
	Test1 t2=new Test1();
	t2.start();
	
	
}

	

}
