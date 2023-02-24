package sleepdemo2;

public class Test extends Thread
{
    public void run()
    {
    	try
    	{
    		for(int i=1; i<=5; i++)
    		{
    			System.out.println(i);
    			Thread.sleep(1000);
    		}
    	}
    	catch(Exception e)
    
    {
    	System.out.println(e);
    }
    
}
    public static void main(String args[])
    {
    	Test t1=new Test();
    	t1.start();
    	
    	Test t2=new Test();
    	t2.start();
    }
}
