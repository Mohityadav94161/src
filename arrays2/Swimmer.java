package arrays2;
import java.util.Scanner;

public class Swimmer {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	int A = 0,B = 0,C = 0,D = 0;
	for(int i = 0; i<t ; i++) {
		int p = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(p>a) {
			while(p>=a) {
			int j = 1;
			int x = a;
			a = x*j;
			j = j+1;
			}
			A = a-p;
		}
		if(p>b) {
			while(p>=b) {
				int j = 1;
				int x = b;
				b = x*j;
				j = j+1;
				}
			B = b-p;
		}
		if(p>c) {
			
			while(p>=c) {
				int j = 1;
				int x = c;
				c = x*j;
				j = j+1;
			}		
			C = c-p;
		}
		if(p<= a ) {
			A = a-p;
			
		}
		if( p<=b  ) {
			B = b-p;
		}
		if( p<=c) {
	
			C = c-p;
		}
		D = Math.min(A, B);
		System.out.println(Math.min(C, D));
		
	}
		
	}

}
