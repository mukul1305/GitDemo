package com.practical;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DuplicateElements2 {

	public static void main(String[] args)
	{
		int list[] = {1,2,3,6,4,3,6,3,2,1};
		int len=list.length;
		List<Integer>dup=new ArrayList();
		int ele,size;
		System.out.println("The length of list:"+len);
		
		for(int i=0;i<len;i++)
		{
			
			ele=0;
			for(int j=i+1;j<len;j++)
			{
				if(list[i]==list[j])
				{
					System.out.println(list[j]);
					//list[j]=0;
				}
			}	
		}
		
	}
}

