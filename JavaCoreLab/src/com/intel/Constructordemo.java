package com.intel;


class AA{

	public AA() {
		System.out.println("Contructor A is called");
		
	}
}
	class BB extends  AA
	{
		public BB()
		{
			System.out.println("Constructor B is called");
		}
	}


	

public class Constructordemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//AA obj1 = new AA();
		//BB obj2 = new BB();
		//AA obj3=new BB();
		//BB obj4=(BB)new AA();
		String str1="Mukul";
		String str2="Jain";
		String str3="Mukul";
		String str4=new String("Jain");
		//str4="Mukul";
		
		System.out.println(str4.equals(str2));
		System.out.println(str1==str3);
	}

}
