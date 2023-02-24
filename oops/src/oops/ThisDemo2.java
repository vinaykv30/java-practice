package oops;

public class ThisDemo2 {
	void display()
	{
		System.out.println("hello");
	}
	void show()
	{
		this.display();
	}
	public static void main(String [] args)
	{
		ThisDemo2 td=new ThisDemo2();
				td.show();
	}
	

}
