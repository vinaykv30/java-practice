package oops;

public class ThisDemo3 {
	{
		System.out.println("no args constructor");
	}
	ThisDemo3(int a)
	{
	    System.out.println("parametrized constructor");	
	}
	public static void main(String args[])
	{
		ThisDemo3 td=new ThisDemo3(10);
	}

}
