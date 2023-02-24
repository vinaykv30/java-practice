package threadnamedemo;

public class ThreadNameDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("hello");
        Thread.currentThread().setName("vinay");
        System.out.println(10/0);      
        
	}

}
