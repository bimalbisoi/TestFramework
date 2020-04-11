package com.pratice.java.program;

public class SwappingOfTwoNumbersWithoutUsingThirdVariable {

	public static void main(String[] args) {
		int a=97;
		int b=115;
		System.out.println("Before swapping the valua of a is:"+a);
		System.out.println("Before swapping the valua of b is:"+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping the valua of a is:"+a);
		System.out.println("After swapping the valua of b is:"+b);

	}

}
