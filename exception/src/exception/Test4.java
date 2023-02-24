package exception;
import java.io.FileInputStream;

public class Test4 {
	public static void main(String args[])
	{
		System.out.println("1");
		try
		{
			System.out.println("2");
			int a=100,b=5,c;
			c=a/b;
			System.out.println("3");
			System.out.println("4");
			System.out.println(c);
			System.out.println("5");
		}
		catch(Exception e)
		{
			System.out.println("6"); 
			System.out.println("7");
			System.out.println(e);
		}
		System.out.println("hello");
	}

}
