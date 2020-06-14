package com.intel;

public class FindSmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {20,21,25,27,38,70,58,10,7};
		int size=arr.length;
		int small=arr[0];
		for(int i=1;i<size;i++)
		{
			if(small>arr[i])
			{
				small=arr[i];
			}
		}
		
		System.out.println("The smallest number is :"+small);
	}

}
