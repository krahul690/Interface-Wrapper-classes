package wRapperclass;

public class Test {
 public static void main(String[] args) {
	Integer i = new Integer(10);
	System.out.println(i);
	
	Integer i1 = new Integer("10");
	System.out.println(i1);
	
	Integer i2 = new Integer("Ten"); //NumberFormateException
	System.out.println(i2);
}
}
