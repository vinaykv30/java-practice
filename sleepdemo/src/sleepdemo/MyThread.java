package sleepdemo;

public class MyThread extends Thread
{
   public void run()
   {
	   for(int i=1;i<=5; i++)
	   {
		   System.out.println(i);
	   }
   }
   public static void main(String args[])
   {
	   MyThread t1=new MyThread();
	   t1.start();
   }
}
