package day20_11thNov2024_m_array_objectclass;

class Sample{
	void display() {
		System.out.println("I am display of Sample class");
	}
}
public class Example3 extends Sample{
	int age=25;
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Sample s1=new Sample();
		System.out.println("Sample class s1: "+s1);
		System.out.println("Sample class s1 integer value: "+s1.hashCode());
		Sample s2=new Sample();
		System.out.println("Sample class s2: "+s2);
		System.out.println("Sample class s2 integer value: "+s2.hashCode());
		System.out.println("s1 and s2 comparision: "+s1.equals(s2));
		
		Example3 ref=new Example3();
		System.out.println("Refeence variable of Example1 class ref: "+ref.toString());//day15.predefinedclasses.Example1@23hguy87213
		//System.out.println("Refeence variable of Example1 class ref: "+ref);//toString() will be called implicitly
		System.out.println("ref address in integer: "+ref.hashCode());
		
		Example3 ref2=new Example3();
		System.out.println("Refeence variable of Example1 class ref2: "+ref2);//toString() will be called implicitly
		System.out.println("ref2 address in integer: "+ref2.hashCode());
		System.out.println("ref and ref2 comparision: "+ref.equals(ref2));
		
		Example3 ref3=ref2;
		System.out.println("Refeence variable of Example1 class ref3: "+ref3);//toString() will be called implicitly
		System.out.println("ref3 address in integer: "+ref3.hashCode());		
		System.out.println("ref3 and ref2 comparision: "+ref3.equals(ref2));
		
		System.out.println("Program Ends");
	}
	
	public boolean equals(Object obj) {//Object obj=ref=new Example2();;
		return true;
	}
	
	public int hashCode() {
		return 101;
	}
	
	public String toString() {
		return "Bangalore";
	}
}
