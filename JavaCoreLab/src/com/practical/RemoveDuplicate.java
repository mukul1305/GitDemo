package com.practical;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,29,30,22,30,6,22,20,29,10};
		//List<int[]>list= Arrays.asList(arr);
		//list.addAll(Arrays.asList(arr));
		//List<Integer>list2=Ints.asList(arr);
		
		List<Integer>list=new ArrayList();
		
		for(int i: arr)
		{
			list.add(Integer.valueOf(i));
		}
		
		
		int len;
		len=list.size();
		
		
		for(int i=0 ;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(list.get(i)==list.get(j))
				{
					list.remove(j);
					len=len-1;
				}
			}
		}
		
		int size=list.size();
		System.out.println("Size of the List:"+size);
		for(int i:list)
		{
			System.out.println(i);
		}
	}

}
