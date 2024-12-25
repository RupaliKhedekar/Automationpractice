package day19_8thNov_Poli_Array;
//no runtime polymorphism because here no method overriding 
//overridig is only of methods 
class Bank2{
	int num=102;
}
class SBI2 extends Bank2{
	int num=103;
}
public class Example4 {

	public static void main(String[] args) {
		Bank2 ref2=new SBI2();//Inheritance + Upcasting = no runtime poly
		System.out.println(ref2.num);
		//System.out.println("print"+ref2.num);

	}

}
