package day20_11thNov2024_m_array_objectclass;

public class Example1 {
	int age = 25;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example1 ref = new Example1();
		/*
		 * System.out.println(ref);// System.out.println(ref.hashCode());
		 * 
		 * or
		 */

		System.out.println("Refeence variable of Example1 class ref: " + ref.toString());// day15.predefinedclasses.Example1@23hguy87213
		// System.out.println("Refeence variable of Example1 class ref:
		// "+ref);//toString() will be called implicitly
		System.out.println("ref address in integer: " + ref.hashCode());

		Example1 ref2 = new Example1();
		/*
		 * System.out.println(ref1);// System.out.println(ref1.hashCode());
		 * System.out.println(ref.equals(ref1));
		 * 
		 * or
		 */
		System.out.println("Refeence variable of Example1 class ref2: " + ref2);// toString() will be called implicitly
		System.out.println("ref2 address in integer: " + ref2.hashCode());
		System.out.println("ref and ref2 comparision: " + ref.equals(ref2));

		Example1 ref3 = ref2;
		/*
		 * System.out.println(ref3);// System.out.println(ref3.hashCode());
		 * System.out.println(ref3.equals(ref1));
		 * 
		 * or
		 */
		System.out.println("Refeence variable of Example1 class ref3: " + ref3);// toString() will be called implicitly
		System.out.println("ref3 address in integer: " + ref3.hashCode());
		System.out.println("ref3 and ref2 comparision: " + ref3.equals(ref2));

		System.out.println("Program Ends");
	}
}