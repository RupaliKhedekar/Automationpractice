package day26_21stNov_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//ArrayList l1=new ArrayList();
			//or
		List ref=new ArrayList();
		ref.add("Pune");//Object obj="Pune"; //Auto upcasting
		ref.add(123);//Boxing--> Integer Object --> Auto Casting --> Object class
		ref.add(true);//Boxing -->upcasting
		ref.add("Pune");
		ref.add(null);
		System.out.println("List element are: "+ref);
		System.out.println("List elements count: "+ref.size());
		ref.add(3, "Bangalore");
		System.out.println("updated, List element are: "+ref);
		System.out.println("updated, List elements count: "+ref.size());
		ref.set(4, "Grapes");
		System.out.println("updated, List element are: "+ref);
		System.out.println("updated, List elements count: "+ref.size());
		
		//System.out.println("Element present at index 3: "+ref.get(3));
		System.out.println("***************Iterate one by one element of list using for loop******************");
		for(int i=0;i<ref.size();i++) {
			System.out.println("Element present at index "+i+": "+ref.get(i));
		}
		System.out.println("***************Iterate one by one element of list using for each******************");
		for(Object obj:ref) {
			System.out.println(obj);
		}
		System.out.println("***************Iterate one by one element of list using Iterator Interface each******************");
		Iterator itr=ref.iterator();
		
//		System.out.println(itr.next());//Pune
//		System.out.println(itr.next());//123
//		System.out.println(itr.next());//true
//		System.out.println(itr.next());//Bangalore
//		System.out.println(itr.next());//Grapes
//		System.out.println(itr.next());//null
//		System.out.println(itr.next());//NoSuchElementException
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("***************Already used Iterator instance******************");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("***************Iterate one by one element of list using Iterator Interface each******************");
		Iterator itr2=ref.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
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
