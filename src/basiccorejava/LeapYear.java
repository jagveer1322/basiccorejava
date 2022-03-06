package basiccorejava;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Please enter year in 4 digit number");
		 int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if((year > 999) && (year < 9999)) {

        if (year % 4 == 0)  {
	    	
	      if (year % 100 == 0) {
	    	  
	         if (year % 400 == 0)
	           
	        	 System.out.println(" this is leap year");
	      }
        }
	 
	         else
	        	 System.out.println(" this is not leap year");
	        }
	      else
	    	  System.out.println("this not correct year please enter in correct syntax");
	      
	      }
        }
