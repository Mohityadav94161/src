package arrays2;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

public class greedy1K {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i  = 0; i<t;i++) {
			int n = sc.nextInt();
			int b = sc.nextInt();
			int arr[] = new int[n];
			for(int j= 0; j<n; j++) {
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);
			
			int sum = b;
			int count = 0;
			for(int k = 0; k<n; k++) {
				if(sum>=arr[k]) {
					sum = sum - arr[k];
//					System.out.println("sum is "+ sum+" and arr[i] is "+ arr[k]);
					count++;
				}
				if(sum==0 || sum < arr[i]) {
					break;
				}
			}
		
			System.out.println(count);
		}

	}

}
