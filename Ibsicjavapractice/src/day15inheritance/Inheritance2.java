package day15inheritance;
//single inheritance
//parent class 
class fruit{
	fruit(){
		System.out.println("fruit class cons...");
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
//child class of fruit
class apple extends fruit{
	apple(){
		System.out.println("apple class cons...");
	}
	public void shape() {
		System.out.println("Apple is round");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		apple fr=new apple();//object of child class
		fr.taste();//call method of parent class
		fr.shape();//call method of child class

	}

}
