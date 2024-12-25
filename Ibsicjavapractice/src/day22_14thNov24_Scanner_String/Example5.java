package day22_14thNov24_Scanner_String;
//String class example
public class Example5 {

	public static void main(String[] args) {
		String s1="   Bangalore   ";
		System.out.println("s1: "+s1);
		System.out.println("number of characters in s1: "+s1.length());
		
		System.out.println("s1: "+s1.trim());
		System.out.println("number of characters in s1: "+s1.trim().length());
		
		String s2="I am learning core java basics, I am from Pune";
		System.out.println("s2: "+s2);
		String[] words=s2.split("a"); 
		for(String str: words) {
			System.out.println(str);
		}
		System.out.println("s2: "+s2);
		String[] word=s2.split(" ",4); 
		for(String str: word) {
			System.out.println(str);
		}
	}
}