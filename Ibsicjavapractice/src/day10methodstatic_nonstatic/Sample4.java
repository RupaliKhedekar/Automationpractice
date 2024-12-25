package day10methodstatic_nonstatic;

public class Sample4 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int principleAmt=550000;
		double
		interest=calculateInterest(principleAmt,8.5,5);
		double finalAmt=principleAmt+interest;
		System.out.println("Final Amount along with interest:"+finalAmt);
		System.out.println("Proram ends");
	}
	public static double calculateInterest(int p,double r, int t) {
		System.out.println("Principle is:"+p);
		System.out.println("ROI is:"+r);
		System.out.println("Duration is:"+t);
		double res=(p*r*t)/100;
	    return res;
		
	    

	}

}
