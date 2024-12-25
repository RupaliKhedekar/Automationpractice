package day22_14thNov24_Scanner_String;
//String class example
public class Example6 {

	public static void main(String[] args) {
		String s1="Bangalore";
		System.out.println("s1: "+s1);
		System.out.println(s1.concat("IT"));
		
		
		
		String s2=s1+123;
		String s3=s1+null;
		System.out.println(s2);
		System.out.println(s3);
		
		s1.concat(null);
	}
}