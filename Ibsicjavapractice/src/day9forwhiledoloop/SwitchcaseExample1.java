package day9forwhiledoloop;

public class SwitchcaseExample1 {

	public static void main(String[] args) {
		char ch='u';
		switch (ch) {
		case'A','a':
			System.out.println("Given character is vowels and char is:"+ch);
		
		break;
		case 'E','e':
			System.out.println("Given character is vowels and char is:"+ch);
		break;
		case 'I','i':
			System.out.println("Given character is vowels and char is:"+ch);	
		break;
		case 'O','o':
			System.out.println("Given character is vowels and char is:"+ch);
			break;
		case'U','u':
			System.out.println("Given character is vowels and char is:"+ch);
		break;
		default:
			System.out.println("Given character is not a vowel");
			break;
			
		}

	}

}
