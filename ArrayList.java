package arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arr {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(1);
		l.add(2);
		l.add(1, 3);
		System.out.println(l);
		
		List<Integer> ll = new ArrayList<Integer>(l);
		
		List<Integer> lf = new ArrayList<>();
		lf.add(4);
		lf.add(5);
		lf.add(6);
		
		ll.addAll(lf);
		
		System.out.println(ll);
		
		Collections.sort(ll);
		
		System.out.println(ll);
		
		
		
//		List<String> ls = new ArrayList<>();
//		ls.add("Nalin");
//		ls.add("Dewangan");
//		ls.add("Copy");
//		ls.add("Fails");
//		ls.add("Tries_again");
//		ls.add("WINS");
//		ls.add("Nalin");
//		
//		System.out.println(ls);
//		
//		boolean a = ls.contains("Nalin");
//		
//		if(a)
//		{
//			System.out.println(ls.lastIndexOf("Nalin"));
//		}
//		System.out.println();
		
		
		
	}
}
