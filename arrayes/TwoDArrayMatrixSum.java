package Array;
import java.util.Scanner;

public class TwoDArrayMatrixSum {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows");
		int row = sc.nextInt();
		System.out.println("Enter the number of Cols");
		int cols = sc.nextInt();
		System.out.println("Enter the values of 1st Matrix");
		int a[][] = new int[row][cols];
		int b[][] = new int[row][cols];
		for(int i= 0;i<row;i++) {
			for(int j = 0; j<cols;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i= 0;i<row;i++) {
			for(int j = 0; j<cols;j++) {
		      System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("Enter the values of 2nd Matrix");
		for(int i= 0;i<row;i++) {
			for(int j = 0; j<cols;j++) {
				
				b[i][j] = sc.nextInt();	
			}
		}
		for(int i= 0;i<row;i++) {
			for(int j = 0; j<cols;j++) {
		      System.out.print(b[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("The Sum of Matrixes is :");
		for(int i= 0;i<row;i++) {
			for(int j = 0; j<cols;j++) {
				int c[][] = new int[row][cols];
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + "\t");
	}
			System.out.println("");
			}
	}
			

}
