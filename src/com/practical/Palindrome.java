package com.practical;

public class Palindrome {

	static int a =10;
	final int b=20;
	public int c=30;
	public void display()
	{
		System.out.println("a="+a+" b="+b+" c="+c);
	}
	
	
	public static void main(String[] args) {
		
		Palindrome p1 =new Palindrome();
		
		Palindrome p2 =new Palindrome();
		p2.a++;
		p1.display();
		Palindrome p3 =new Palindrome();
		
		p2.c++;
		
		p2.display();
		p3.display();
		// TODO Auto-generated method stub

		/*int sum=0, rem,n,temp;
		
		n=556;
		temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		
		if(temp==sum)
		{
			System.out.println("The Number "+temp+" is Palindrome");
		}
		else
		System.out.println("The number "+temp+" is not palindrome");*/
	}

}
