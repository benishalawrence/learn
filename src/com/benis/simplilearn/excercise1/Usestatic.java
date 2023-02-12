package com.benis.simplilearn.excercise1;

public class Usestatic {
	static int a=1;
	static int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method(5);}
	static void method(int x)
	{
		System.out.println("the value of a" +a);
	System.out.println("the value of b" +b );
	System.out.println("the value of x" +x);
		
	}
	static
	{b=a*a;
		}

	}