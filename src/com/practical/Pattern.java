package com.practical;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int i;
		
		/*for(i=0;i<=5;i++)
		{
			
			for(int j=0;j<i;j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}*/
		
		//Right angle triangle rotated at 360*
		
		/*for(int i=5;i>0;i--)
		{
			for(int j=i-1;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int k=5;k>i-1;k--)
			{
			System.out.print("*");
			}
			System.out.println();
		}*/
		
		//Triangle
		for(int i=9;i>0;i=i-2)
		{
		 for(int j=i/2;j>0;j--)
		{
		  System.out.print(" ");
		}
		  for(int k=9;k>i-1;k--)       
		  {
			System.out.print("*");
		  }
		  System.out.println();
		 }
		
	}

}
