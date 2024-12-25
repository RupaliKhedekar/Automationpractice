package day22_14thNov24_Scanner_String;
//String class example
public class Example2 {

	public static void main(String[] args) {
		//String object using new keyword and object will be stored outside String Constant Pool area of heap
		String s1=new String("Pune");//two object 1. SCP 2. Non SCP
		String s2=new String("Pune");//one object 1. non SCP
		String s3=new String("Bangalore");//two object 1. SCP 2. Non SCP
		System.out.println("s1: "+s1);//toString() is overried that will give value stored inside the object
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		//comparing two object based on values
		System.out.println("s1 and s2 with equals(): "+s1.equals(s2));
		System.out.println("s1 and s3 with equals(): "+s1.equals(s3));
		//comparing two objects based on address
		System.out.println("s1 and s2 with '==': "+(s1==s2));
		System.out.println("s1 and s3 with '==': "+(s1==s3));

	}

}