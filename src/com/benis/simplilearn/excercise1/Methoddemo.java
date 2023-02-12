package com.benis.simplilearn.excercise1;

public class Methoddemo {
	double width;
	double height;
	double length;
	void volume() {
	
System.out.print("the volume is " +width*length*height);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//box b1;
		
		Methoddemo b1=new Methoddemo();
		double volume;
		b1.width=15;
		b1.height=12;
		b1.length=4;
		b1.volume();
		
		
		Methoddemo b2;
		b2=new Methoddemo();
		
		b2.width=20;
		b2.height=30;
		b2.length=40;
		
		b2.volume();
	}


	

}






