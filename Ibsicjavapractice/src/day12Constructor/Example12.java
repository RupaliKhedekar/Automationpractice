package day12Constructor;

public class Example12 {
int num;
Example12(int num){
	System.out.println("Local num:"+num);
	System.out.println("NSGV num:"+this.num);
	//global=local
	this.num=num;
	System.out.println("Local num:"+num);
	System.out.println("NSGV num:"+this.num);
	}
	public static void main(String[] args) {
		System.out.println("Program stats");
		Example12 ref1=new Example12(25);
		System.out.println("Program ends");
		

	}

}
