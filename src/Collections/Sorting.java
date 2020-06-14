package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();

		list.add(7);
		list.add(57);
		list.add(24);
		list.add(12);
		list.add(91);
		list.add(36);
		// 12 57 24 7 91 36
		System.out.println("The Integer List of Elements:" + list);
		// Collections.sort(list);
		// System.out.println("The Integer List of Elements:"+list);

		String str="  HI I   a m   Mukul     Jain   ";
		
		System.out.println("My name is"+str);
		
		System.out.println("My name is after trimming"+str.trim());
		int small ;
		
		int pos = 0, size = list.size();
		System.out.println("size:" + size);

		for (int i = 0; i < size; i++) {
			small = list.get(i);
			for (int j = i + 1; j < size; j++) {
				if (small > list.get(j)) {

					small = list.get(j);
					pos = j;
					// System.out.println("small:"+small);
				}

			}
			if (pos != 0) {
				Collections.swap(list, i, pos)
				;
			}
			pos = 0;
		}
		 System.out.println("The Sorted List Elements:"+list);
	}

}
