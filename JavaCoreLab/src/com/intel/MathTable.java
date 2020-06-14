package com.intel;

import java.util.Scanner;

public class MathTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("---Enter a any integer number to print mathmatic table on console-----:");
		int input= scan.nextInt();
		
		System.out.println("Enter Programmer's Name:");
		String str=scan.next();
		int res=0;
		
		for(int i=10;i>0;i--)
		{
			res=i*input;
			System.out.println(input+ " * "+i+" ="+res);
			res=0;
		}
	}

}
