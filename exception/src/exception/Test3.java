package exception;
import java.io.FileInputStream;

public class Test3 {
	public static void main(String args[])
	{
		try
		{
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("you cannot divide by zero");
		}
		System.out.println("hello");
	}

}
