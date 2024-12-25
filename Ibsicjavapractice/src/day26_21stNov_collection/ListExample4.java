package day26_21stNov_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//ArrayList l1=new ArrayList();
			//or
		//Generic concept in collection
		List<String> ref1=new ArrayList<String>();
		ref1.add("Grapes");
		ref1.add("123");
		System.out.println("List1 element are: "+ref1);
		System.out.println("List1 elements count: "+ref1.size());
		
		List<Boolean> ref2=new ArrayList<Boolean>();
		ref2.add(true);
		ref2.add(false);
		System.out.println("List2 element are: "+ref2);
		System.out.println("List2 elements count: "+ref2.size());
		
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
