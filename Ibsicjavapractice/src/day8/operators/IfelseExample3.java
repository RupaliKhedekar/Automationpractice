package day8.operators;

public class IfelseExample3 {

	public static void main(String[] args){
		System.out.println("Program starts");
		int age=18;
		char bldGroup='A';
		if(age>=18) {
			System.out.println("Welcome age verification done successfully");
			if(bldGroup=='O') {
				System.out.println("Thanks for donating your blood");
			}else {
				System.out.println("Sorry,you are not eligible to donate blood due to mismatch  of blood group");
			
			}
			}else {
				System.out.println("'Sorry,you are not eligible to donate blood due age factor");
			}
		System.out.println("program ends");
				
				
			}
		
		// TODO Auto-generated method stub

	

}
