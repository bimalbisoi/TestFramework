package com.pratice.java.program;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before swapping the valua of a is:"+a);
		System.out.println("Before swapping the valua of b is:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping the valua of a is:"+a);
		System.out.println("After swapping the valua of b is:"+b);

	}

}
