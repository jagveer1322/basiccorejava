package basiccorejava;

public class QuotientRemainder {
	
	public static void main(String[] args) {

	    int dividend = 25, divisor = 4;

	    int quotient = dividend / divisor;      // dividend/divisor=quotient + remainder
	    int remainder = dividend % divisor;

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);


}
}