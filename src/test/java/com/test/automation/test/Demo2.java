package com.test.automation.test;

public class Demo2 extends Demo1 {
 int x;
 String stringName;
 Demo2(int x,String stringName )
 {
	 super(x, "y");
	 this.x=x;
	 this.stringName=stringName;
	 System.out.println("constructor of Demo2 class executed");
 }
	public static void main(String[] args) {
		
		Demo2 demo21=new Demo2(5,"bimal");

		System.out.println(demo21.x);
		System.out.println(demo21.stringName);
	
	}

}
