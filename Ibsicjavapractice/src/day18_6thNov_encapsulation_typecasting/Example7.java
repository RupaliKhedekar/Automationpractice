package day18_6thNov_encapsulation_typecasting;
public class Example7 {

	public static void main(String[] args) {
		
		//Child c1=new GrandFather();//down casting not possible directly in java, first upcast and you can perform downcasting
		
		GrandFather ref1=new Child();//Auto Upcasting
		ref1.myHome();
		
		Child ref2=(Child)ref1;//downcasting
		ref2.myHome();
		ref2.myCar();
		ref2.myBike();	
	}
}