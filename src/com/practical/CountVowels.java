package com.practical;

public class CountVowels {

	public void sum(int a,int b)
	{
		System.out.print("Sum method is called");
	}
	
	public long sum(long a,long b)
	{
		System.out.println("Sum method is called");
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountVowels cw=new CountVowels();
		cw.sum(204242, 20);
		String str="My name is mukul";
		int vowel=0,conso=0;
		int len=str.length();
		char []ch=str.toCharArray();
		for(int i=0; i<len;i++)
		{
			if((Character.toLowerCase(ch[i])=='a')||(Character.toLowerCase(ch[i])=='e')||(Character.toLowerCase(ch[i])=='i')||(Character.toLowerCase(ch[i])=='o')||(Character.toLowerCase(ch[i])=='u'))
			{
				vowel++;
			}
			else if(ch[i]!=' ')
				conso++;
		}
		System.out.println("The number of vowels in string "+str+" :"+vowel);
		System.out.println("The number of consonants in string "+str+" :"+conso);
	}

}
