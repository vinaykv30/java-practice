package exception;

public class Test18 {
	public static void main(String[] args)
	{
		Test t=new Test();
		try
		{
			t.divide();
		}
		catch(ArithmeticException e)
		{
			
		}
	   
	}
	void divide()
	{
		int a=100,b=0,c;
		c=a/b;
		System.out.println(c);
	}
}
