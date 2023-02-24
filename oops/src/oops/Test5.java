package oops;

public class Test5 {
	void show() {
		System.out.println("1");
	}
}
class Xyz extends Test5{
	void show() {
		System.out.println("2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Test5 t=new Test5();
       t.show();
       
       Xyz ob=new Xyz();
       ob.show();
	}

}
