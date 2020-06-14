package com.intel;

class A{
	public void print()
	{
		System.out.println("A Class Printable");
	}
}

class B extends A{
	public void print() {
		System.out.println("B Class Printable");
	}
}

public class MethodOverRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj1=new B();
		A obj2=new A();
	//	B obj3=new A();
		obj1.print();
		obj2.print();
	}

}
