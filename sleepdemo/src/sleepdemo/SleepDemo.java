package sleepdemo;

public class SleepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1; i<5; i++)
        {
        	Thread.sleep(1000);
        	System.out.println(i);
        }
	}

}
