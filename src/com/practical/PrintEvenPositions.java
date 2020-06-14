package com.practical;

import java.util.Arrays;

public class PrintEvenPositions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print Array numbers at odd position
		
		int[] arr= {1,29,30,22,30,6,8,20,9,10};
		int len,large=0;
		len=arr.length;
		
		for(int i=0;i<len;i=i+2)
		{
			System.out.println(arr[i]);
		}
		
		//print largest element in an array!!
		
		for(int i=0;i<len;i++)
		{
			if(large<arr[i])
			{
				large=arr[i];
			}
		}
		
		System.out.println("The Largest Element is:"+large);
		
		//Sort array elements in ascending order
		
		int temp;
		for(int i=0;i<len-1;i++)
	{
			for(int j=i+1;j<len;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
		Arrays.sort(arr);
		System.out.println("Sorted List Elements after method:");
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Sorted List Elements:");
		
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Third Largest Element in the list:"+arr[len-3]);
	}

}
