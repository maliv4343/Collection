package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();

		list.add("acer");
		list.add("lenovo");
		list.add("mac");
		
		//System.out.println(list);
		
		//Iterator<String> itr=list.iterator();
		//while(itr.hasNext()) {
		//	System.out.println(itr.next());
		//}
		
		list.forEach((k)->System.out.println(k));
	}

}
