package Array;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] marks = new double[10];
		for(int  i =0; i<=marks.length-1;i++) {
        marks[i] = sc.nextDouble();
		}
		double average=0;
		for(int j=0;j<=marks.length-1;j++) {
			average = average + marks[j];
		}
		average /= marks.length;
		System.out.print("Average of the marks is "+average);
		

	}

}
