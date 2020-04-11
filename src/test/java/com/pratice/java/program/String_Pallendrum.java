package com.pratice.java.program;
/*A palindrome number is a number that is same after reverse. 
For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
It can also be a string like LOL, MADAM etc.*/

public class String_Pallendrum {

	public static void main(String[] args) {
		String s = "MADAM";
		if (isPallendrum(s)) {
			System.out.println(s + " is palindrome");
		} else {
			System.out.println(s + " is not  palindrome");
		}
	}

	public static Boolean isPallendrum(String s) {
		s = s.toLowerCase();
		int n = s.length();
		Boolean flag = true;
		for (int i = 0; i < n / 2; i++) {
			if (s.charAt(i) != s.charAt(n - 1 - i)) {
				flag = false;
				break;
			}
		}

		return flag;

	}

}
