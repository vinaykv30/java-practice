package sleepdemo2;

public class Test1 {
	 public void run()
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
	    	Test1 t1=new Test1();
	    	t1.run();
	    	
	    	Test1 t2=new Test1();
	    	t2.run();
	    }
	}



