package day26_21stNov_collection;

import java.util.ArrayList;
import java.util.List;

public class Genericconcepttry_by_me {

	public static void main(String[] args) {
		List<String> ref1=new ArrayList<String>();
		ref1.add("Rupali");
		ref1.add("123");
		System.out.println(ref1);
		List<Boolean> ref2=new ArrayList<Boolean>();
		ref2.add(true);
		ref2.add(false);
		System.out.println(ref2);
		List<Character> ref3=new ArrayList<Character>();
		ref3.add('a');
		ref3.add('b');
		System.out.println(ref3);
		List<Integer> ref4=new ArrayList<Integer>();
		ref4.add(123);
		System.out.println(ref4);

	}

}
