package Array;
import java.util.*;

public class Expression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a !=1 && b!= 1 && c!=1) {
			System.out.print(a*b*c);
		}
		if(a ==1 && b== 1 && c==1) {
			System.out.print(a+b+c);
		}
		if(a ==1 && b== 1 && c!=1) {
			System.out.print((a+b)*c);
		}
		if(a !=1 && b== 1 && c==1) {
			System.out.print(a*(b+c));
		}
		if(a ==1 && b!= 1 && c==1) {
			System.out.print(a+b+c);
		}
		if(a !=1 && b== 1 && c!=1) {
			int count = Math.max((a+b)*c,a*(b+c));
			System.out.print(count);
		}
		if(a ==1 && b!= 1 && c!=1) {
			System.out.print((a+b)*c);
		}
		if(a !=1 && b!= 1 && c==1) {
			System.out.print(a*(b+c));
		}

	}

}
