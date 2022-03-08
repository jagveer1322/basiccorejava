package functional;
import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit :");
        double t = sc.nextDouble();
        System.out.println("Enter the wind speed in miles per hour: ");
        double v = sc.nextDouble();
        if(t < 50 && v < 120 && v > 3) {
            double windChill = 35.74 + 0.62158 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
            System.out.println("The windchill is :"+ windChill);
        }
        else
            System.out.println("Invalid input");
    }
}
