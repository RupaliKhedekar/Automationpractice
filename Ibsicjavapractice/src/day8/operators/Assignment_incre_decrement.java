package day8.operators;

public class Assignment_incre_decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=0,res;
res=num1++ + ++num1 + ++num1 +num1;
//initial 0+2+3+3
//final   1+2+3+3
System.out.println("Number1:" + num1);
System.out.println("Result:" + res);
num1=0;
res=num1-- + --num1 + --num1+num1;
//initial 0+-2+-3+-3
//final   -1+-2+-3+-3
System.out.println("Number1:" + num1);
System.out.println("Result:" + res);

num1=0;
res=--num1+ --num1+ --num1 +num1 + ++num1 + num1++;
//initial -1+-2+-3+-3+-2+-2
//final   -1+-2+-3+-3+-2+-1
System.out.println("Number1:" + num1);
System.out.println("Result:" + res);
num1=0;
res=num1-- + num1 + ++num1 + num1++ + ++num1 +num1++ + num1;
//initial 0+-1+0+0+2+2+3
//final   -1+-1+0+1+2+3+3
System.out.println("Number1:" + num1);
System.out.println("Result:" + res);


	}

}
