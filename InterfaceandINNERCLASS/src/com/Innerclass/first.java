package com.Innerclass;

public class first {

	int num;
	
	A obj = new A();
	
	
	public void show()
	{
		num=10;
		System.out.println("in show "+num);
	}
	class A //inner class
		{
		
		 public void config()
		 {
			 System.out.println("hey innerclass"+num);
		 }
	}
	public static void main(String[] args) {
		
		first f = new first();
		f.show();
		System.out.println();
	}
}
