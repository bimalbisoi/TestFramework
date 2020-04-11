package com.pratice.java.program;

public class PrimeNumber {

	public static void main(String[] args) {
		
		if(isPrime(48)) {
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
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
