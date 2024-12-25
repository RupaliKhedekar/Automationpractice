package day26_21stNov_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListExample5 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		List<Integer> list=new ArrayList<Integer>();
		list.add(25);
		list.add(15);
		list.add(30);
		list.add(25);
		list.add(15);
		list.add(25);
		System.out.println("List Elememts are: "+list);
		System.out.println("in List total occurance of 25 is: "+Collections.frequency(list, 25));
		Set<Integer> set=new HashSet<Integer>(list);
		System.out.println("Set elements are: "+set);
		Iterator<Integer> itr=set.iterator();
//		for(int i=0;i<set.size();i++) {
//			int num=itr.next();
//			System.out.println("in List total occurance of "+num+" is: "+Collections.frequency(list, num));
//		}
		
		while(itr.hasNext()) {
			int num=itr.next();
			System.out.println("in List total occurance of "+num+" is: "+Collections.frequency(list, num));
		}
		System.out.println("Program Ends");
	}
}
/*
Iterator:
	will help you to iterate one by one element of collection without using index
	its has some useful methods like
		hasNext(): boolean 
				   true: mean collection has next element
				   false: mean no next element in collection
		next():	it will give next element of collection,if there are not next element in collection dn it will return an exception
				like: NoSuchElementException
		remove(): it will help you to remove element from collection
	NOTE: Iterator interface instance can be used only once, for 2nd iteration you have to create new instance
*/