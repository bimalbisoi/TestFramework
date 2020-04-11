package com.test.automation.test;

public class Demo1 {
  int rollNumber;
 String name;
 Demo1(int x,String y)
 {
	 rollNumber=x;
	 name=y;
	 System.out.println("Parameter constructor of Demo1 class executed");
 }
/* Demo1()
 {
	 System.out.println("constructor of Demo1 class executed");
 }*/
	public static void main(String[] args) {
		Demo1 demo=new Demo1(3,"abc");
		System.out.println(demo.rollNumber);
		System.out.println(demo.name);

	}

}
