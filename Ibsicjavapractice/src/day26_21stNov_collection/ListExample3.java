package day26_21stNov_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//ArrayList l1=new ArrayList();
			//or
		List ref1=new ArrayList();
		ref1.add("Pune");//Object obj="Pune"; //Auto upcasting
		ref1.add(123);//Boxing--> Integer Object --> Auto Casting --> Object class
		ref1.add(true);//Boxing -->upcasting
		ref1.add("Grapes");
		ref1.add(null);
		System.out.println("List1 element are: "+ref1);
		System.out.println("List1 elements count: "+ref1.size());
		
		List ref2=new ArrayList();
		ref2.add("Apple");
		ref2.add("Grapes");
		ref2.add("Mango");
		System.out.println("List2 element are: "+ref2);
		System.out.println("List2 elements count: "+ref2.size());
		
		ref1.retainAll(ref2);
		System.out.println("Common element between ref1 and ref2: "+ref1);
		
		ref1.clear();
		System.out.println("After clearing ref1: "+ref1);
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
