package com.practical;

public class CountStringCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Gargi Loves Mukul";
		int count=0,i=0;
		char arr[] = str.toCharArray();
		System.out.println("Size of String is:"+arr[i]);
		while(arr[i]!='\0')
		{
			System.out.println(arr[i]);
			i++;
			count++;
		}
		System.out.println("Size of String is:"+count);
	}

}
