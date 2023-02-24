package threadjoindemo;

public class Test1 extends Thread{
	
	
	     public void run()
	     {
	    	 try
	    	 {
	    		 for(int i=1 ; i<=5; i++)
	    		 {
	    			 System.out.println("child Thread  : "+i);
	    			 Thread.sleep(1000);
	    		 }
	    	 }
	    	 catch(Exception e)
	    	 {
	    		 System.out.println(e);
	    	 }
	     }
	     public static void main(String args[]) throws InterruptedExcpetion
	     {
	    	 Test1 t=new Test1();
	    	 t.start();
	    	 t.join();

	    	 try
	    	 {
	    		 for(int i=1 ; i<=5; i++)
	    		 {
	    			 System.out.println("main Thread  : "+i);
	    			 Thread.sleep(1000);
	    		 }
	    	 }
	    	 catch(Exception e)
	    	 {
	    		 System.out.println(e);
	    	 }
	     }

}
