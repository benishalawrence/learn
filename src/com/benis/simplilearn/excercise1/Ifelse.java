package com.benis.simplilearn.excercise1;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=Integer.parseInt(args[0]);
		if(a==12||a<=2)
		{System.out.print("season is winter");
			}
		else if(a<=5)
		{System.out.print("season is spring");
		}
		else if(a<=8)
		{System.out.print("season is summer");
		}
		else {
			System.out.print("season is autumn");
		}}}