package com.benis.simplilearn.excercise1;

public class Addmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{3,4},{6,7}};

		int b[][]= {{9,10},{19,13}};
		int c[][];
		c=new int[2][2];

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
		{
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]);
				
		}}}}


