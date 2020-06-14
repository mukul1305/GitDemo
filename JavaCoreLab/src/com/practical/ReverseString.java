package com.practical;

public class ReverseString {

	static public  void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hey My name is Mukul Jain";
		int len=str.length();
		int j=0;
		char[] ch=str.toCharArray();
		char ch2[]=new char[len];
		String rev = "";
		System.out.println(len);
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+ch[i];
			ch2[j]=ch[i];
			j++;
		}

		System.out.println("reverse:"+rev);
		for(int i=0;i<len;i++)
		{
			System.out.println(ch2[i]);
		}
	}

}
