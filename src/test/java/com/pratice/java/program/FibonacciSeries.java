package com.pratice.java.program;
//0 1 1 2 3 5 8 13 21 34

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		System.out.println(n1);
		System.out.println(n2);
		int i=1;
		while(i < 10) {
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			i++;
		}
	}
}
