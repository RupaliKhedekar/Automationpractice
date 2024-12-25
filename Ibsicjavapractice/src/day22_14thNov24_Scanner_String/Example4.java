package day22_14thNov24_Scanner_String;
//String class example
public class Example4 {

	public static void main(String[] args) {
		//String object using new keyword and object will be stored outside String Constant Pool area of heap
		String s1=new String("Bangalore");//two object 1. SCP 2. Non SCP
		System.out.println("s1: "+s1);
		System.out.println("number of characters in s1: "+s1.length());
		System.out.println("character at index 3: "+s1.charAt(3));
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		System.out.println(s1.isEmpty());
		System.out.println(s1.startsWith("Ban"));
		System.out.println(s1.endsWith("ore"));
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1.replace('a', 'X'));
		System.out.println(s1.replaceFirst("a", "X"));
	}
}