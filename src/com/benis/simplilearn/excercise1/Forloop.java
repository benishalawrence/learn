package com.benis.simplilearn.excercise1;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		boolean isprime;
		if(a>2) 
			isprime=true;

		else
			

			isprime=false;
			


		for(int i=2;i<=a/i;i++)
		{
			if(a%i==0)
			{
				
			isprime=false;
				break;}}
		if(isprime)
		{
			System.out.print("prime");
		}
		else
		{System.out.print("not prime");}}}
					
			
