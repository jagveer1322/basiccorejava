package basiccorejava;
import java.util.Scanner;

public class Largestnumber {
		public static void main(String[] args) {
			int firstno, secondno, thirdno;
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter first number:");
	       firstno = input.nextInt();
	        System.out.print("Enter second number:");
	        secondno= input.nextInt();
	        System.out.print("Enter third number:");
	       thirdno = input.nextInt();
			 if(firstno > secondno && firstno > thirdno)
		        {
		            System.out.println("Largest number is:"+firstno);
		        }
		        else if(secondno > thirdno)
		        {
		            System.out.println("Largest number is:"+secondno);
		        }
		        else
		        {
		            System.out.println("Largest number is:"+thirdno);
		        }
		}

	}
