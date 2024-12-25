package day19_8thNov_Poli_Array;
//Runtime polymorphism: it required method overriding+inheritance+upcasting
class Bank{
	void roi() {
		System.out.println("Bank roi is 10.56");
	}
}
class SBI extends Bank{
	void roi() {
		System.out.println("SBI roi is 12.56");
	}
}
public class Example2 {

	public static void main(String[] args) {
		SBI ref1=new SBI();
		ref1.roi();
		Bank ref2=new SBI();
		ref2.roi();
		

	}

}
