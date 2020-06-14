package com.practical;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Modi is back";
		String str2="Back is modi";
		int len1,len2;
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char []ch1=str1.toCharArray();
		char []ch2=str2.toCharArray();
		
		len1=str1.length();
		len2=str2.length();
		
		if(len1!=len2)
		{
			System.out.println("Strings are not equal,not anagram");
			exit(1);
		}
		

		Arrays.sort(ch1);
		Arrays.sort(ch2);	
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("Strings are anagram");		
		}
		
	}

	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}

}
