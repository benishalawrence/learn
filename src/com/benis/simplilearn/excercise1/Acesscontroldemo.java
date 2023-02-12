package com.benis.simplilearn.excercise1;

public class Acesscontroldemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acesscontrol obj=new Acesscontrol();

		obj.a=30;
		obj.b=50;
		obj.setc(30);
		System.out.print("the value of a" +obj.a);
		System.out.print("the value of b" +obj.b);
		System.out.print("the value of c" +obj.getc());
		

	}

}
