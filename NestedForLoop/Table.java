package NestedForLoop;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x =sc.nextLong();
		for(long i=1;i<=10;i++) {
			for(long j=1;j<=x;j++) {
				System.out.print(j*i+"\t");
			}
			System.out.println(" ");
		}
		

	}

}
