package harshu;

   public class Polymorphism{
	void show()
	{
		System.out.println("1");
	}
	class Raju extends Polymorphism
	{
		void show()
		{
			System.out.println("2");
		}
		public static void main (String args[])
		{
			Polymorphism p=new Polymorphism();
			p.show();
			
			Raju r=new Raju();
			r.show();
		}
	}

}

