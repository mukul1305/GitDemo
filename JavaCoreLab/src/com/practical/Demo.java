package com.practical;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo {

	
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Vikas";
		s1.age = 35;
		s1.rollno =345;
		
		Student s2 = new Student();
		s2.name = "Amit";
		s2.age = 32;
		s2.rollno = 234;

		Student s3 = new Student();
		s2.name = "Tarun";
		s2.age = 36;
		s2.rollno = 346;
		
		List<Student> list = new ArrayList<Student>();
		System.out.println(s1.equals(s2));
		
		list.add(s1);
		list.add(s2);
		
		list.sort(new Comparator<Student>() {

			@Override
			public int compare(Student std1, Student std2) {
				
				if(std1.name.compareToIgnoreCase(std2.name) == 0)
				{
					return std1.age;
				}
					
			}
			
		});
	}

}
