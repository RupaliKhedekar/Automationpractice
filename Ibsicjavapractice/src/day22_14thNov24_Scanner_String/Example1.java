package day22_14thNov24_Scanner_String;
//String class example
public class Example1 {

	public static void main(String[] args) {
		//String object using literal and object will be stored in String Constant Pool area of heap
		String s1="Pune";
		String s2="Pune";//no object will be create as its not unique
		String s3="Bangalore";
		System.out.println("s1: "+s1);//toString() is overried that will give value stored inside the object
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		//comparing two object based on values
		System.out.println("s1 and s2 with equals(): "+s1.equals(s2));//true on the basis of value as Pune,Pune
		System.out.println("s1 and s3 with equals(): "+s1.equals(s3));//false on the basis of value as Pune,Bangalore
		//comparing two objects based on address
		System.out.println("s1 and s2 with '==': "+(s1==s2));//True on the basis of address
		System.out.println("s1 and s3 with '==': "+(s1==s3));//Flase on the basis of address

	}

}
