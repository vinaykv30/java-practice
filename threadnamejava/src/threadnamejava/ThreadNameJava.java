package threadnamejava;

public class ThreadNameJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("hello");
    System.out.println(Thread.currentThread().getName());
    Thread.currentThread().setName("deepak");
    System.out.println("New Thread Name : "+Thread.currentThread().getName());
	}

}
