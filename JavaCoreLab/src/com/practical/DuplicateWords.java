package com.practical;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
										
		String str="Dog is  black    black is dog black black";
		String []splitted=str.split("\\s+");
		int size=splitted.length;
		int count;
		System.out.println("Duplicates words are:");
		for(int i=0;i<size;i++)
		{
			count=1;
			for (int j=i+1;j<size;j++)
			{
				if (splitted[i].equalsIgnoreCase(splitted[j]) )
				{
					count++;
					splitted[j]="0";
				}
				
			}
			if(count>1 && splitted[i]!="0")
			{
				System.out.println(splitted[i]);
			}
		}
	}

}
