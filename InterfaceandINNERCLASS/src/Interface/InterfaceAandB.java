package Interface;

interface A{
	void m1();
}
interface B{
	void m2();
}
interface DemoAB extends A,B{
	void m3();
}
class SimpleAB implements DemoAB{
	public void m1()
	{
		
		System.out.println("m1 is here");
	}
	public void m2()
	{
		System.out.println("m2 is here");
	}
	public void m3()
	{
		System.out.println("m3 is here");
	}
}
public class InterfaceAandB {

	public static void main(String[] args) {
		SimpleAB ab = new SimpleAB();
		ab.m1();
		ab.m2();
		ab.m3();
	}
}
