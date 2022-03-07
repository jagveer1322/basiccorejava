package basiccorejava;
import java.util.Scanner;

public class Powerof2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a value of n (less than 31) ");
	        int num = sc.nextInt();
	        if ((num >= 0) && (num < 31)) {
	            for (int i = 0; i <= num; i++) {
	                int value = (int) Math.pow(2,i);
	                System.out.println("2 ^ "+ i +" = " +value);
	            }
	        }
			else {
	            System.out.println("Invalid input.");
	        }
	    }
}