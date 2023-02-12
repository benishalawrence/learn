package com.benis.simplilearn.excercise1;

public class Twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][];
		a=new int[4][5];
		int k=0;
		for(int i=0;i<4;i++)
		{
			for (int j=0;j<5;j++)
		{
			a[i][j]=k;
			
			System.out.println("value of twodimenarray is["+i+"]["+j+"]:" +a[i][j]);
			k++;
		}
			
		}
	}

}
