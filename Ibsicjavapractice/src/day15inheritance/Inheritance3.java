package day15inheritance;
//parent class
class fourwheeler{
	//default constructor
	public void wheels() {
		System.out.println("I have 4 wheels");
	}
}
//car class is child class of fourwheeler class and parent of maruti class
class car extends fourwheeler{
	//default constructor with default super()
	public void type() {
		System.out.println("I'm a car");
	}
}
//child class of car class
class maruti extends car{
	//default constructor with default super()
	public void company() {
		System.out.println("I'm maruti");
	}
}
public class Inheritance3 {

	public static void main(String[] args) {
		System.out.println("Progra starts");
		maruti fr=new maruti();//object of child class
		fr.wheels();
		fr.type();
		fr.company();
		System.out.println("Progra ends");
	}

}

/**
add debug point in the required line
f6---> next line or you want to execute current line
f5---> if you want to go inside the called method
f8---> continue

*/
