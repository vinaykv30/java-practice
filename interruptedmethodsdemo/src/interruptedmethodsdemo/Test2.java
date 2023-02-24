package interruptedmethodsdemo;

public class Test2 extends Thread{
	
		
		public void run()
		{
			//System.out.println("A  :" +Thread.interrupted());       //true->false
			System.out.println("A  :"+Thread.currentThread().isInterrupted());      //true->true
			try
			{
				for(int i=1; i<=5; i++)
				{
					System.out.println(i);
					Thread.sleep(1000);
					//System.out.println("B :" +Thread.interrupted());
				}
				
			}
			catch(Exception e)
			{
				System.out.println("Thread Interrupted :"+e);
			}
		}
		public static void main(String args[])
		{
			Test2 t=new Test2();
			t.start();
			 t.interrupt();
		}

}

