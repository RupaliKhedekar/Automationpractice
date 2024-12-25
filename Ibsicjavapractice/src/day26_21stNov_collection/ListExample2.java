package day26_21stNov_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//ArrayList l1=new ArrayList();
			//or
		List ref1=new ArrayList();
		ref1.add("Pune");//Object obj="Pune"; //Auto upcasting
		ref1.add(123);//Boxing--> Integer Object --> Auto Casting --> Object class
		ref1.add(true);//Boxing -->upcasting
		ref1.add("Pune");
		ref1.add(null);
		System.out.println("List1 element are: "+ref1);
		System.out.println("List1 elements count: "+ref1.size());
		List ref2=new ArrayList();
		ref2.add("Green");
		ref2.add("Blue");
		ref2.add("Yellow");
		System.out.println("List2 element are: "+ref2);
		System.out.println("List2 elements count: "+ref2.size());
		
		ref2.addAll(ref1);
		System.out.println("After Adding ref1 into ref2, elements of ref2 are: "+ref2);
		ref2.removeAll(ref1);
		System.out.println("After removing ref1 into ref2, elements of ref2 are: "+ref2);
		
		ref2.addAll(2,ref1);
		System.out.println("After Adding ref1 into index2 of ref2, elements of ref2 are: "+ref2);
		ref2.removeAll(ref1);
		System.out.println("After removing ref1 into ref2, elements of ref2 are: "+ref2);
		
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