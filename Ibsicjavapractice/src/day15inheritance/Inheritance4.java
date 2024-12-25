package day15inheritance;
//hierarchical inheritance because no.of child class of one parent class
//OR how to know that it is hierarchical inheritance
//here bike class ,scooter class ,car1 calss extends vehicle class thats why one/single parent clas havs no. of child class
// parent class
class vehicle{
	public void wheels() {
		System.out.println("I have wheels");
	}
}
// first child class of vehicle class
class bike extends vehicle{
	public void countwl() {
		System.out.println("I am a bike & has 2 wheels");
	}
}
// second child class of vehicle class
class car1 extends vehicle{
	public void countwlc() {
		System.out.println("I am car & has 4 wheels");
	}
}
//third child class of vehicle class
class scooter extends vehicle{
	public void countwls() {
		System.out.println("I am a scooter and has 2 wheels");
	}
}
public class Inheritance4 {

	public static void main(String[] args) {
		car1 c=new car1(); // object of car class
		c.wheels();
		c.countwlc();
		bike b=new bike();// object of bike class
		b.wheels();
		b.countwl();
		scooter sc=new scooter();// object of scooter class
		sc.wheels();
		sc.countwls();
		
		
		

	}

}
