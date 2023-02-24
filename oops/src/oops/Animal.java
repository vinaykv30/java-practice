package oops;

public class Animal {
	public void run() {
		System.out.println("i am running");
	}
	public static void main(String[] args) {
		   System.out.println("1");
		   Animal buzo=new Animal();
		   buzo.eat();
		   buzo.run();
		   Birds sp=new Birds();
		   sp.fly();
		   
		   
		   
		   Animal aa=new Animal();
		   aa.run();
		   aa.eat();
	}
	public void eat() {
		System.out.println("i am eating");
	}
}
class Birds
{
	void fly() {
		System.out.println("i am flying");
	}
}
