package polymorphism;


public class Test4 {
	 void show(int a,float b)
	  {
		  System.out.println("int float method");
	  }
	  void show(float a,int b)
	  {
		  System.out.println("float int method");
		  
	  }
	  public static void main(String[] args)
	  {
		  Test4 t=new Test4();
		  t.show(10,20.5f);
		  t.show(20.5f,10);
		
		 
		  
	  }
}
