package Array;
import java.util.*;

public class GameWithStick {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		if(m==n&&m%2==0) {
			System.out.print("Malvika");
		}
		if(m==n && m%2 !=0) {
			System.out.print("Akshat");
		}
		if(m>n && n%2==0) {
			System.out.print("Akshat");
		}
		if(m>n && n%2 !=0) {
			System.out.print("Malvika");
		}
		if(m<n && m%2!=0) {
			System.out.print("Malvika");
		}
		if(m<n && m%2==0) {
			System.out.print("Akshat");
		}
		
		
		

	}

}
