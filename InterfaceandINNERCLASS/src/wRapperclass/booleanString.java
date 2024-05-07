package wRapperclass;

public class booleanString {
	public static void main(String[] args) {
		/*
		 * String input => Case is not important
		 * if case is insensitive of true then it is treated as true
		 * and other treated as false
		 */
		Boolean b1 = new Boolean("true");
		Boolean b2 = new Boolean("True");
		
		Boolean b3 = new Boolean("false");
		Boolean b4 = new Boolean("False");
		
		Boolean b5 = new Boolean("Rahul");
		Boolean b6 = new Boolean("TRUE");
		
		System.out.println(b1);// true
		System.out.println(b2);// true
		
		System.out.println(b3);// false
		System.out.println(b4);// false
		
		System.out.println(b5);// false
		System.out.println(b6);// true
	}
}
