package functional;
import java.util.Scanner;

public class Quadraticroots {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the value of a");
	        int a = sc.nextInt();
	        System.out.println("Enter the value of b");
	        int b = sc.nextInt();
	        System.out.println("Enter the value of c");
	        int c = sc.nextInt();
	        int delta = b * b - 4 * a * c;
	        if(delta >= 0) {
	            double x1 = (- b + Math.sqrt(delta)) / (2*a);
	            double x2 = (- b - Math.sqrt(delta)) / (2*a);
	            System.out.println(" roots :  "+x1 +" and " +x2);
	        }
	        else
	            System.out.println("no roots or imaginary roots");
	    }
	}



