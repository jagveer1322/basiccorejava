package basiccorejava;
import java.util.Scanner;
	
public class HarmonicSeries {
	public static void main(String[] args){
        System.out.print("Enter any number : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.print("The Harmonic Series is : ");
        double sum = 0.0;
        if (num > 0) {
            for (double i = 1; i <= num; i++) 
            {
                sum += 1 / i;
                System.out.print("1/"+i +"+");
            }
            System.out.println("\n The harmonic sum is " + sum);
        }
        else{
            System.out.println("n cannot be zero");
            }
}
}