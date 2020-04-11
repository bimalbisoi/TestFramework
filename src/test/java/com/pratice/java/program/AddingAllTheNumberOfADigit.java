package com.pratice.java.program;

//576
//5+7+6=18
public class AddingAllTheNumberOfADigit {

	public static void main(String[] args) {
		int n=896;
		int sum=0;
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;

		}
		System.out.println("Sum of all the digit is: "+ sum);
	}

}
