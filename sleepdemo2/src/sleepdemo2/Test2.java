package sleepdemo2;

public class Test2 {
	 public void start()
	    {
	    	try
	    	{
	    		for(int i=1; i<=5; i++)
	    		{
	    			System.out.println(i+" :"+Thread.currentThread().getName());
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
	    	Test2 t1=new Test2();
	    	t1.start();
	    	
	    	Test2 t2=new Test2();
	    	t2.start();
	    }

}
