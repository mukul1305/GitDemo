package com.practical;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DuplicateElements {

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
					ele=list[i];
					list[j]=0;
				}
			}
			
			dup.add(ele);	
			System.out.println(dup.get(i));
		}
		
		System.out.println("The List of the elements are:");
		size=dup.size();
		System.out.println("The List size:"+size);
		
		//ArrayindexoutOfBounds exception occurs in this method
		/*for(int i=0;i<size;i++)
		{
			if(dup.get(i) == 0)
			{
				dup.remove(i);
			}
		}*/
		
		//Duplicate value Exception occurs in this method
		/*for(int item:dup)
		{
			if(dup.get(item) == 0)
			{
				dup.remove(item);
			}
			
		}*/
		
		Iterator<Integer>it=dup.iterator();
		
		while(it.hasNext())
		{
			int temp=it.next();
			if(temp==0)
			{
				it.remove();
			}
		}
		
		System.out.println("The List of the elements after processing:");
		for(int i=0;i<dup.size();i++)
		{
			
			System.out.println(dup.get(i));
		}
		
	}
}

