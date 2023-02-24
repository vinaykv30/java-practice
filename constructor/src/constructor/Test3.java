package constructor;

public class Test3 {
	Test3(int a){
		System.out.println("parametrized constructor");
	}
	public static void main(String[] args) {
		Test3 t=new Test3(10);
	}

}
