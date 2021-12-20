package Array;
import java.util.Arrays;
import java.util.*;

public class Twins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i = 0; i<n; i++) {
			 arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int count  = 0;
		int sum = 0;
		for(int i = 0; i<n;i++) {
			sum += arr[i];
			
		}
		int c = 0;
		for(int i = n-1; i>=0; i--) {
			c += arr[i];
			count++;
			if(c > sum/2) {
				System.out.println(count);
				return;
			}
			
		}

	}

}
