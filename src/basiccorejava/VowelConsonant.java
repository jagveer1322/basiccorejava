package basiccorejava;
import java.util.Scanner;

public class VowelConsonant {
	    public static void main(String[] args) {
	    	
	    System.out.println("Enter the Alphabet");
	    Scanner ch = new Scanner(System.in);
	    char alphabet = ch.next( ).charAt(0);
	    
	    if(alphabet == 'a' || alphabet == 'i' || alphabet == 'e' || alphabet ==  'o' || alphabet == 'u')
	            System.out.println(" this alphabet is vowel");
	    	
	    else 
	    		System.out.println("this alphabet is consonant");
	     }
}