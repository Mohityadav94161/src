package Loops;
import java.util.Scanner;

public class XtoThePowerY {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the power ");
		int x = sc.nextInt();
		System.out.println("Input the number");
		int z = sc.nextInt();		
		int y =1;
		for(int i=1;i<=x;i++) {
			 y = z*y;
			System.out.println(y); 
		}
        System.out.println("The final answer is " + y);
	}

}
