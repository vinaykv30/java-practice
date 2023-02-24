package sleepdemo;

	public class MyThread1 extends Thread
	{
	   public void run()
	   {
		   for(int i=1;i<=5; i++)
		   {
			   try
			   {
				   Thread.sleep(1000);
			   }
			   catch(Exception e)
			   {
				   System.out.println(e);
			   }
			   System.out.println(i);
		   }
	   }
	   public static void main(String args[])
	   {
		   MyThread1 t1=new MyThread1();
		   t1.start();
	   }
	}




