package com.benis.simplilearn.excercise1;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,45,60,100};
		int i;
		float j=0;
		for( i=0;i<a.length;i++)
		{
			j=j+a[i];}

			System.out.print("the mean vale is "  +j/a.length);
	}

}
