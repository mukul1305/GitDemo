package com.practical;

import java.util.StringTokenizer;

public class RemoveMultipleSpace {

	public static void main(String[] args)
	{
	String str="Hey  My name   is     mukul       jain";
	StringTokenizer sk= new StringTokenizer(str," ");
	StringBuilder sb= new StringBuilder();
	//StringBuffer sb1= new StringBuffer();
	
	while(sk.hasMoreTokens())
	{
		sb.append(sk.nextElement().toString()).append(" ");
		//sb1.append(sk.nextToken()).append(" ");
	//System.out.println(sk.toString());
	}
	System.out.println(sb);
	}
}
