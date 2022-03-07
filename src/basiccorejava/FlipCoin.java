package basiccorejava;
import java.util.Scanner;

public class FlipCoin {
	    public static void main(String[] args) {
	        int heads = 0;
	        int tails = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of times to flip the coin : ");
	        int n = sc.nextInt();
	        if (n > 0) {
	            for (int i = 0; i < n; i++) {
	                double face = Math.random();
	                System.out.println("" + face);
	                if (face > 0.5)
	                    heads++;
	                else
	                    tails++;
	            }
	            float hp = heads * 100 / n;
	            float ht = tails * 100 / n;
	            System.out.println("Heads : " + heads);
	            System.out.println("Tails : " + tails);
	            System.out.println("Percentage of Heads : " +hp);
	            System.out.println("Percentage of Tails : " +ht);
	        }
	        else {
	            System.out.println("Invalid value of n.");
	        }
}
}