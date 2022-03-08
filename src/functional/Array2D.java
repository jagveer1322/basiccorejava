package functional;
import java.util.Scanner;
import java.util.Random;

public class Array2D {
	
	    void setArray(int[][] array) {
	        Random randomvalue=new Random();
	        for(int i=0;i<array.length;i++) {
	            for(int j=0;j<array[i].length;j++) {
	                array[i][j]=randomvalue.nextInt(10);
	            }
	        }
	    }

	    void getArray(int[][] array) {
	        for(int i=0;i<array.length;i++) {
	            for(int j=0;j<array[i].length;j++) {
	                System.out.printf("%d ",array[i][j]);
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter array dimension rows (m)");
	        int m=sc.nextInt();
	        System.out.println("Enter array dimension columns (n)");
	        int n=sc.nextInt();
	        int[][] array=new int [m][n];
	        Array2D obj=new Array2D();
	        obj.setArray(array);
	        obj.getArray(array);
	    }	
}
