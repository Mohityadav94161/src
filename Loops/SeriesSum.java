package Loops;
import java.util.Scanner;

public class SeriesSum {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many digits sum you wants");
		int x = sc.nextInt();
		
		float y = 0;
		for(float i=1;i<=x;i+=1) {
		 
		 if (i%2==0) {
			 y -= 1/i;
			 System.out.println("The "+i+ " negative numbers is " + y );
		 }
		 else {
			 y +=1/i;
			 System.out.println("The " +i+ " positive numbers are  " +y);
		 }
			
			
	}
		System.out.println("The final sum is "  + y);
		
}
}


