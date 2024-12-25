package day18_6thNov_encapsulation_typecasting;
public class Example6 {

	public static void main(String[] args) {
		Child ref1=new Child();
		ref1.myHome();
		ref1.myCar();
		ref1.myBike();
		
		//Father ref2=ref1;//auto upcasting
		//Father ref2=(Father)new Child();// explicit upcasting
		Father ref2=(Father)ref1;// explicit upcasting
		ref2.myHome();
		ref2.myCar();
		
		
	//	GrandFather ref3=ref1;//auto upcasting
	//	GrandFather ref3=(GrandFather)new Child();// explicit upcasting
		GrandFather ref3=(GrandFather)ref1;// explicit upcasting
		ref3.myHome();
	}

}
