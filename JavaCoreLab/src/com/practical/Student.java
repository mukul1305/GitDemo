package com.practical;

import java.util.Comparator;

public class Student implements Comparator<T> {

	String name;
	int age;
	int rollno;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
		
	}

	@Override
	public boolean equals(Object other)
	{
		if(other == null) return false;
		
		Student std = (Student)other;
		
		return this.name.equalsIgnoreCase(std.name) && this.age == std.age && this.rollno == std.rollno;
	}
	
	@Override
	public int hashCode()
	{
		int hashValue = this.name.hashCode();
		return hashValue;
	}
	
	
}
