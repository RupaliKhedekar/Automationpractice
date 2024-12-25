package day20_11thNov2024_m_array_objectclass;
//overriding method toStrig()(return type_String),hashCode()(return type_int);equals(object obj)(boolean)
public class Example2{
	int age=25;
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example2 ref=new Example2();
		System.out.println("Refeence variable of Example1 class ref: "+ref.toString());//day15.predefinedclasses.Example1@23hguy87213
		//System.out.println("Refeence variable of Example1 class ref: "+ref);//toString() will be called implicitly
		System.out.println("ref address in integer: "+ref.hashCode());
		
		Example2 ref2=new Example2();
		System.out.println("Refeence variable of Example1 class ref2: "+ref2);//toString() will be called implicitly
		System.out.println("ref2 address in integer: "+ref2.hashCode());
		System.out.println("ref and ref2 comparision: "+ref.equals(ref2));
		
		Example2 ref3=ref2;
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
