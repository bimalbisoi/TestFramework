package com.pratice.java.program;

// Print all the prime number between  3 to 100

public class PrimeNumberPrint_Between_3_To_100 {

	public static void main(String[] args) {
		for(int i=3;i<=100;i++)
		{
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	public static Boolean  isPrime(int n) {
		Boolean flag=true;
		for(int i=2;i<n;i++) {
			if(n%i == 0) {
				flag=false;
				break;
			}
		}
		return flag;  
	}
}
