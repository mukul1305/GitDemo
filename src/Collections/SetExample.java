package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> Ilist=new HashSet<Integer>();
		Set<String> Ilist2=new HashSet<String>();
		Ilist.add(12);
		Ilist.add(13);
		Ilist.add(14);
		Ilist.add(15);
		Ilist.add(16);
		Ilist.add(17);
		
		List <String> Ilist3= Arrays.asList("Mukul","Gargi","Vikas","Vivek","Rahul","Mona","Anjali");
		
		String first=Ilist3.get(0);
		String last=Ilist3.get((Ilist3.size()-1));
		System.out.println("--------The List of elements are-----");
		System.out.println("All Element are:"+Ilist3);
		System.out.println("The First Element is:"+first);
		System.out.println("The Last Element is:"+last);
		
		List<String>Il=new ArrayList<String>();
		
		System.out.println("The Element in the list is:"+Ilist.iterator().hasNext());
		System.out.println("------The Integer Elements List-----");
		for(Integer li:Ilist)
		{
			System.out.println(li);
		}
		
		Iterator it=Ilist.iterator();
		
		System.out.println("------The Second Integer Elements List-----");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	

}
