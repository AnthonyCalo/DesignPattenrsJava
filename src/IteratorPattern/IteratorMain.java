package IteratorPattern;

import java.util.Iterator;
import java.util.List;

public class IteratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new MyArrayList<>();
		ls.add("Tony");
		ls.add("Paulie");
		ls.add("Christopher");
		ls.add("Vito");
		ls.add("Salvatore");
		
		System.out.println(ls);
		Iterator<String> iter = ls.iterator();
		Iterator<String> iter2 = ls.iterator();
		while(iter.hasNext()) {
			System.out.println("> " + iter.next());
		}
		while(iter2.hasNext()) {
			System.out.println("--" + iter2.next());
		}
		
	}

}
